package nowcoder.test4399;

import java.util.Date;
import java.util.Scanner;

/**
 * 小陆每天要写一份工作日报，日报标题含有日期。几年后，他翻开以前的日报，想知道两份日报的日期是否同为星期几，请编程帮助他判断。
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0) {
            n--;
            int y1 = sc.nextInt();
            int m1 = sc.nextInt();
            int d1 = sc.nextInt();
            int y2 = sc.nextInt();
            int m2 = sc.nextInt();
            int d2 = sc.nextInt();
            Date date1 = new Date(y1 + "/" + m1 + "/" + d1);

            Date date2 = new Date(y2 + "/" + m2 + "/" + d2);
           if(date1.getDay()==date2.getDay())
               System.out.println("True");
           else
               System.out.println("False");
        }


    }
}
