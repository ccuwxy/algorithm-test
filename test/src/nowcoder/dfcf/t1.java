package nowcoder.dfcf;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String[] split = string.split("#");
        String first = split[0];
        String second = split[1];
        int[] count = new int[128];
        for (int i = 0; i < first.length(); i++) {
            count[first.charAt(i)]++;
        }
        for (int i = 0; i < second.length(); i++) {
            count[second.charAt(i)]--;
        }
        boolean flag = true;
        for (int i = 0; i < 128; i++) {
            if (count[i]<0){
                flag = false;
            }
        }
        System.out.println(flag);
    }
}

