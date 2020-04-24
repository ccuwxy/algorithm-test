package nowcoder.qianxinyy2020;

import java.text.NumberFormat;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double num;
        if (n >= 990)
            num = 1;
        else {
            double a1 = 1, a2 = 1;
            if (n <= 10) {
                for (int i = 0; i < n; i++) {
                    a1 *= (990 - i);
                    a2 *= (1000 - i);
                }
            } else {
                for (int i = 0; i < 10; i++) {
                    a1 *= (990 - n - +i);
                    a2 *= (1000 - n + i);
                }
            }
            num = 1 - (a1 / a2);
        }

        System.out.println(String.format("%.6f", num));
    }
}
