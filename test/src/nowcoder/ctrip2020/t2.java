package nowcoder.ctrip2020;

import java.util.*;

/**
 * 携程海洋馆的海豚小宝宝
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 携程海洋馆中有 n 只萌萌的小海豚，初始均为 0 岁，每只小海豚的寿命是 m 岁，
 *
 * 且这些小海豚会在 birthYear[i] 这些年份生产出一位宝宝海豚（1 <= birthYear[i] <= m），每位宝宝海豚刚出生为 0 岁。
 *
 * 问 x 年时，携程海洋馆有多少只小海豚？
 *
 * 输入
 * n（初始海豚数）
 *
 * m（海豚寿命）
 *
 * 海豚生宝宝的年份数量(假设为p)
 *
 * 海豚生宝宝的年份1
 *
 * ...
 *
 * 海豚生宝宝的年份p
 *
 * x（几年后）
 *
 * 输出
 * x年后，共有多少只小海豚
 *
 *
 * 样例输入
 * 5
 * 5
 * 2
 * 2
 * 4
 * 5
 * 样例输出
 * 20
 */
public class t2 {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
//    static long countDolphin(int n, int m, int[] birthYear, int x) {
//
//
//    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        long res;

        int _n;
        _n = Integer.parseInt(in.nextLine().trim());

        int _m;
        _m = Integer.parseInt(in.nextLine().trim());

        int _birthYear_size = 0;
        _birthYear_size = Integer.parseInt(in.nextLine().trim());
        int[] _birthYear = new int[_birthYear_size];
        int _birthYear_item;
        for(int _birthYear_i = 0; _birthYear_i < _birthYear_size; _birthYear_i++) {
            _birthYear_item = Integer.parseInt(in.nextLine().trim());
            _birthYear[_birthYear_i] = _birthYear_item;
        }

        int _x;
        _x = Integer.parseInt(in.nextLine().trim());

//        res = countDolphin(_n, _m, _birthYear, _x);
//        System.out.println(String.valueOf(res));

    }
}

