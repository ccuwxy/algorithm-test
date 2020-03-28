package nowcoder.testhortor;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            String[] nums = str.split("\\*");
            long s = 1;
            int len = nums.length;
            for (int i = 0; i < len ; i++) {
                s *= Long.parseLong(nums[i]);
            }
            System.out.println(s);
        }

    }
}
