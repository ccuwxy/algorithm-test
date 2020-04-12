package nowcoder.ks2020;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class t3 {

    /**100
     * 根据顾客属性计算出顾客排队顺序
     *
     * @param a int整型一维数组 顾客a属性
     * @param b int整型一维数组 顾客b属性
     * @return int整型一维数组
     */
    public int[] WaitInLine(int[] a, int[] b) {
        int n = a.length;
        Queue<Node> queue = new PriorityQueue<>((i, j) -> (int) ((j.ai - j.bi) - (i.ai - i.bi)));
        for (int i = 0; i < n; i++) {
            queue.offer(new Node(a[i], b[i],i+1));
        }
        int ans[] = new int[n];
        List<Integer> list = new ArrayList<>();
        for (int i = 0;!queue.isEmpty();i++){
            ans[i] = queue.poll().num;
        }

        return ans;
    }

    class Node {
        int num;
        int ai;
        int bi;
        public Node() {
        }
        public Node(int a, int b,int n) {
            ai = a;
            bi = b;
            num = n;
        }
    }

    public static void main(String[] args) {
//        WaitInLine(new int[]{8,9,7},new int[]{5,8,3});
    }
}