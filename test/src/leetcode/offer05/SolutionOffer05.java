package leetcode.offer05;

import java.util.Stack;

/**
 * 面试题06. 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 */
public class SolutionOffer05 {
    public static void main(String[] args) {
        Solution s = new Solution();

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    static class Solution {
        public int[] reversePrint(ListNode head) {
            ListNode node = head;
            Stack<Integer> stack = new Stack<>();
            while (node!=null){
                stack.push(node.val);
                node = node.next;
            }
            int[] ints = new int[stack.size()];
            int i = 0;
            while (!stack.isEmpty()){
                ints[i++] = stack.pop();
            }
            return ints;

        }
    }

}

