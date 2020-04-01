package nowcoder.ctrip2019;

import java.util.Scanner;

/**
 *
 输入一个long类型的数值, 求该数值的二进制表示中的1的个数 .
 */
public class t23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        int count = 0;
//        while (l != 0) {
//            long t = l ^ 1L;
//            if(t == l - 1)
//                count++;
//            l = l >>> 1;
//        }
        while (l != 0) {
            l = l & (l - 1);
            count++;
        }
        System.out.println(count);
    }
}
