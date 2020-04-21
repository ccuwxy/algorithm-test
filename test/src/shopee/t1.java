package shopee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class t1 {
    public static void main(String[] args) {

    }
    static class  TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static List<Integer> count(TreeNode root){
        TreeNode head = root;
        List<Integer> ans = new ArrayList<>();
        if (root==null)
            return ans;
        if(head != null) {
            LinkedList<TreeNode> list = new LinkedList<>();
            int num = 1;
            int next = 0;
            TreeNode node;
            list.addLast(root);
            while(list.size() > 0) {
                node = list.removeFirst();
                num--;

                if(node.left != null) {
                    list.addLast(node.left);
                    next++;
                }

                if(node.right != null) {
                    list.addLast(node.right);
                    next++;
                }

                if(num == 0) {
                    ans.add(node.val);
                    num = next;
                    next = 0;
                }
            }
        }
        return ans;
    }
}
