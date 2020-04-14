package nowcoder.qianxin2020;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] s = str.split(",");
        int len = s.length;
        int[] ints = new int[len];
        for (int i = 0; i < len; i++) {
            ints[i] = Integer.parseInt(s[i]);
        }
        int s1 = 0,s2 = 0,s3 = 0;
        for (int i = 0; i < len-2;i++){
            s1+=ints[i];
            for (int j = i; j < len-1;j++){
                s2+=ints[j];
                if (s1 < s2)
                    break;
                if (s1==s2) {
                    for (int k = j; k < len; k++) {
                        s3 += ints[k];
                    }
                    s3+=ints[0];
                    if (s2==s3){
                        System.out.println("yes");
                        return;
                    }
                    s3 = 0;
                }
            }
            s2 = 0;
        }
        System.out.println("no");
    }
}
