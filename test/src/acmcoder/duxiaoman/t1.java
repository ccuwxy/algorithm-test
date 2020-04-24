package acmcoder.duxiaoman;

import java.util.Scanner;

/**
 * 滑动窗口
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 在机器学习中有一种流行的池化操作，而在池化操作中，3*3极大值池化应用十分广泛。什么是3*3极大值池化呢？设原矩阵是n*m的，则3*3极大值池化就是枚举矩阵中的所有3*3的子矩阵,分别求最大值并顺次拼接而成，处理过后的矩阵是(n-2)*(m-2)。
 *
 * 例如，原矩阵是[[1,2,3,4],[5,6,7,8],[9,10,11,12]],经过池化之后就变成[[11,12]]。
 *
 * 为了提高难度，选择的滑动窗口并不是3*3的，而是a*b的，由于输入可能是非常大的，原n*m的矩阵权值由以下公式计算得到，h(i,j)=i*j mod 10。(1<=i<=n,1<=j<=m)
 *
 * 由于输出矩阵也是一个很麻烦的事情，因此你只需输出经过a*b池化处理后的矩阵的元素之和即可。
 *
 * 输入
 * 输入第一行包含四个正整数，n,m,a,b，分别表示原矩阵的行列数量和滑动窗口的行列数量。(1<=n,m,a,b<=1000)
 *
 * 输出
 * 输出仅包含一个整数，即新矩阵的元素之和。
 *
 *
 * 样例输入
 * 4 5 3 3
 * 样例输出
 * 54
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i <n ; i++) {

        }
    }

    public static long MDet(int[][] m){
        if (m==null || m.length!=m[0].length)
            return 0;
        if (m.length==1)
            return m[0][0];
        else if (m.length==2)
            return m[0][0]*m[1][1]-m[1][0]*m[0][1];
        else {
            for (int i = 0; i < m[0].length; i++) {

            }


        }
return 0;
    }


}
