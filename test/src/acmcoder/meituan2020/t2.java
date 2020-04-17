package acmcoder.meituan2020;

import java.util.Scanner;

/**63%
 * 伪随机
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 有这么一段伪代码
 * <p>
 * input a,b,m,x
 * <p>
 * while true:
 * <p>
 * x=(a*x+b)%m
 * <p>
 * print(x)
 * <p>
 * end while
 * <p>
 * 输出的x由于是在取模意义下的，所以会出现循环。
 * <p>
 * 比如，a=2, b=1, m=5, x=2的时候，输出的序列将会如下：
 * <p>
 * 0,1,3,2,0,1,3,2,0,1,3,2....
 * <p>
 * 其中：0,1,3,2 称为最短的循环节。
 * <p>
 * 现在给定a,b,m,x的值，请你计算最短循环节的长度。
 * <p>
 * 输入
 * 输入4个数，a,b,m,x
 * <p>
 * 输出
 * 输出一个数，最短循环节的长度
 * <p>
 * <p>
 * 样例输入
 * 2 1 5 2
 * 样例输出
 * 4
 */
public class t2 {
    static int[] next = new int[1000000];
    static int i = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[1000000];
        int[] ans = new int[2];
        ans[0] = 0;
        while (true) {
            x = (a * x + b) % m;
            nums[i] = x;
            i++;

            check(nums);
            ans[1] = i - next[i];
            if (ans[1] == ans[0]) {
                System.out.println(ans[1]);
                break;
            } else {
                ans[0] = ans[1];
            }


        }
    }

    public static void check(int[] nums) {
        int j = 0;
        int k = -1;
        next[0] = -1;
        while (j < i) {
            if (k == -1 || nums[j] == nums[k]) {
                next[++j] = ++k;
            } else {
                k = next[k];
            }
        }
    }
}
