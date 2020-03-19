package nowcoder.test4399;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * 一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第n次落地时，共经过多少米？第n次反弹多高？（n<=10）
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 100;
        double ans1 = 100,ans2 = 0;
        for (int i = 0; i < n; i++) {
            ans1 +=ans2*2;
            ans /= 2;
            ans2 = ans;
        }
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(6);
        System.out.print(String.format("%.6f",ans1)+" ");
        System.out.println(String.format("%.6f",ans2));


    }
}
