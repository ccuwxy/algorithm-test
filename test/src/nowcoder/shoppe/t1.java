package nowcoder.shoppe;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));
    }
    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1 || s.length() == 0)
            return s.length();
        int max = 0;
        int len = s.length();
        int[] map = new int[128];
        for (int i = 0, j = 0; j < len; j++) {
            int step = s.charAt(j);
            i = Math.max(map[step], i);
            map[step] = j + 1;
            max = Math.max(max, j - i + 1);
        }
        return max;
    }
}
