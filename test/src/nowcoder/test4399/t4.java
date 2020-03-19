package nowcoder.test4399;

import java.util.Scanner;

/**
 * 段誉身具凌波微波，动无常则，若危若安，一次能走一级台阶或者两级台阶，他要爬一段30级的山路，问有多少种走法？分析如何计算，然后编程解答。
 * 进阶问题：当他轻功熟练度提升，一次最多可以走三级，那就结果有什么变化？后来走火入魔了，不能走一级，只能走二或三级，又有什么变化？
 */
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(calcStep12(n)+" ");
        System.out.print(calcStep123(n)+" ");
        System.out.print(calcStep23(n));
    }
    public static int calcStep123(int a) {
        if (a == 1 || a == 0) {
            return 1;
        }
        if (a < 1) {
            return 0;
        }
        if (a == 2) {
            return 2;
        }
        return calcStep123(a - 1) + calcStep123(a - 2) + calcStep123(a - 3);
    }

    public static int calcStep23(int a) {
        if (a == 3) {
            return 1;
        }
        if (a <= 1) {
            return 0;
        }
        if (a == 2) {
            return 1;
        }
        return calcStep23(a - 2) + calcStep23(a - 3);
    }
    public static int calcStep12(int a) {
        if(a == 1) {
            return 1;
        }else if(a==2) {
            return 2;
        }
        int[] count =new int[a+1];
        count[1] =1;
        count[2] =2;
        for (int i = 3; i < a+1; i++) {
            count[i] =count[i-1]+count[i-2];
        }
        return count[a];
    }
}

