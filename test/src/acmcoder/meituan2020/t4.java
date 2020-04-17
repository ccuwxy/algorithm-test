package acmcoder.meituan2020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 64%
 * 伪中位数
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * n个数的伪中位数定义为从小到大排序后第⌊(n+1)/2⌋个数。其中，⌊x⌋的意思是x向下取整。
 * <p>
 * 现在，给你n个数，你需要向其中增加最少的数，使得k成为最后这一组数的伪中位数。
 * <p>
 * 请问你需要加入数的最少数。
 * <p>
 * 输入
 * 输入第一行包含两个数n,k,意为原来数的个数和最后的伪中位数。
 * <p>
 * 接下来一行n个数a_i，空格隔开，代表原来的数。
 * <p>
 * 1≤n≤500,1≤a_i≤100000
 * <p>
 * 输出
 * 输出一个数，你需要加入数的最少数量。
 * <p>
 * <p>
 * 样例输入
 * 4 2
 * 2 3 3 3
 * 样例输出
 * 2
 * <p>
 * 提示
 * 样例解释：加入1,1后,原数组变为1,1,2,3,3,3,其伪中位数为2。
 */
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] index = new int[500];
        int c = 0;
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] == k) {
                index[c++] = i;
            }

        }
        int min = 100000;
        int ans;
        for (int i = 0; i < c; i++) {
            if (index[i] < n / 2) {
                ans = n - 2 * index[i] - 2;
            } else if (index[i] == n / 2) {
                ans = 0;
            } else
                ans = index[i] - (n - index[i] - 1);

            min = Math.min(min, ans);
        }

        System.out.println(min);
    }
}


/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        int index =0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == k){
                index = i;
                break;
            }
        }
        int ans = 0;
        ans = n-index-1;
        if (n % 2 == 0)
            ans--;
        if (index > 0)
            ans -= index;
        System.out.println(ans);
    }
}
*/
