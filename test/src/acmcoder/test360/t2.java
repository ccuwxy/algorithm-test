package acmcoder.test360;

public class t2 {
    public static void main(String[] args) {

    }
}

/**
 * 随机减法
 * 时间限制：C/C++语言 2000MS；其他语言 4000MS
 * 内存限制：C/C++语言 131072KB；其他语言 655360KB
 * 题目描述：
 * 给定一个数a0，定义如下随机序列a1,a2,...an。
 *
 * 1、从闭区间[0,a0]中等概率随机选出一个整数k0，令a1=a0-k0。
 *
 * 2、得到随机数a1之后，再从闭区间[0,a1]中等概率随机选出一个整数k1，再令 a2=a1-k1。
 *
 * 3、一般地，得到随机数ai之后，再从闭区间[0,ai]中等概率随机选出一个整数ki，令ai+1=ai-ki。
 *
 * 问an=0的概率是多少?
 *
 * 输入
 * 输入两个整数n,a0(1≤n,a0≤100)。
 *
 * 输出
 * 输出概率，小数点后四舍五入保留5位小数。
 *
 *
 * 样例输入
 * 3 3
 * 样例输出
 * 0.72049
 *
 * 提示
 * 输入样例2
 * 1 3
 * 输出样例2
 * 0.25000
 *
 * 输入样例3
 * 100 3
 * 输出样例3
 * 1.00000
 */
