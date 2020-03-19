package nowcoder.test4399;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * 有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
 */
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        //LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }
        int count = n;
        int i = 1;
        int num = 0;
        while (count>1){
            if(a[(i-1)%n]==1){
                num++;
            }

            if(num==3){
                a[(i-1)%n] = 0;
                count--;
                num=0;
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            if(a[j]==1){
                System.out.println(j+1);
            }
        }
    }
}
