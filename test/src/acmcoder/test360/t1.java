package acmcoder.test360;
/**
 * 最后赢家
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 最强的不一定是最后的赢家。
 *
 * 某赛事有n名选手参加，但是不同于其他的比赛，本比赛采取的是擂台赛的形式，n名选手排成一排，每次队伍的第一位和第二位选手进行比赛，输的一方会排到队尾。
 *
 * 当某位选手取得m连胜时，他将成为最后的赢家，且游戏结束，请问截止到游戏结束，共会进行多少次比赛。
 *
 * 两位选手的比赛结果由他们的战斗力决定，n位选手的战斗力是一个1~n的排列，也就是说他们的战斗力两两不同，不会有平局的情况。
 *
 * 输入
 * 输入第一行包含两个正整数n，m，分别代表参赛选手数量和取得连胜的要求。(1<=n<=100000，1<=m<=10^9)
 *
 * 输入第二行包含n个正整数，中间用空格隔开，第i个数表示队伍的第i位选手的战斗力，整体是一个1~n的排列。
 *
 * 输出
 * 输出仅包含一个正整数，表示截止到游戏终止，共进行多少场比赛。
 *
 *
 * 样例输入
 * 4 2
 * 1 3 2 4
 * 样例输出
 * 2
 *
 * 提示
 * 样例解释
 * 显然第一局应该是战斗力为3的选手获胜，第二局同样是战斗力为3的选手获胜，2连胜终止游戏，所以答案是2。此时若修改m为3，则结果是5。
 */

import java.util.Scanner;

public class t1 {
    static class Node{
        int p;
        Node next;
        int ok = 0;

        public Node(int p, Node next) {
            this.p = p;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Node first ;
        Node end;
        Node temp;
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.nextInt(),null);
        }
        for (int i = 0; i <n-1; i++) {
            nodes[i].next = nodes[i+1];
        }
        first = nodes[0];
        end = nodes[n-1];
        temp = nodes[0];

        int ans = 0;
        while (first.ok < k){
            ans++;
            if (first.p>first.next.p){
                first.ok++;
                end.next = first.next;
                end = end.next;
                first.next = first.next.next;

            }else {
                first.ok = 0;
                first.next.ok++;
                temp = first;
                first = first.next;
                end.next = temp;
                end = end.next;
            }
            end.next = null;
        }
        System.out.println(ans);
    }
}
