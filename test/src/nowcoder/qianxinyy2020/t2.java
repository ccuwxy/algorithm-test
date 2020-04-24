package nowcoder.qianxinyy2020;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getNum(n));
    }
    public static long getNum(int n){
        if (n<=0)
            return 0;
        else if (n==1 || n==2 || n==3 || n==4)
            return 1;
        else
            return getNum(n-1)+getNum(n-4);
    }
}
