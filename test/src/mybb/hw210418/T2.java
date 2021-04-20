package mybb.hw210418;

import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        char[] valueStr = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        String s1 = sc.next();
        String s2 = sc.next();
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        int str1Len = str1.length;
        int str2Len = str2.length;
        if (str1Len > 1 && str1[0] == '0') {
            System.out.println(-1);
            return;
        }
        if (str2Len > 1 && str2[0] == '0') {
            System.out.println(-1);
            return;
        }
        for (int i = 0; i < str1Len; i++) {
            if (str1[i] >= '0' && str1[i] <= '9') {
                if (str1[i] - '0' >= n) {
                    System.out.println("-1");
                    return;
                } else {
                    str1[i] -= '0';
                }
            } else if (str1[i] >= 'a' && str1[i] <= 'z') {
                if (str1[i] - 'a' >= (n - 10)) {
                    System.out.println(-1);
                    return;
                } else {
                    str1[i] -= ('a' - 10);
                }
            } else {
                System.out.println(-1);
                return;
            }
        }

        for (int i = 0; i < str2Len; i++) {
            if (str2[i] >= '0' && str2[i] <= '9') {
                if (str2[i] - '0' >= n) {
                    System.out.println("-1");
                    return;
                } else {
                    str2[i] -= '0';
                }
            } else if (str2[i] >= 'a' && str2[i] <= 'z') {
                if (str2[i] - 'a' >= n - 10) {
                    System.out.println(-1);
                    return;
                } else {
                    str2[i] -= ('a' - 10);
                }
            } else {
                System.out.println(-1);
                return;
            }
        }

        int nindex = 1;
        int nret = s1.compareTo(s2);
        if (nret > 0) {
            for (int i = 0; i < str2Len; i++) {
                if (str1[str1Len - nindex] >= str2[str2Len - nindex]) {
                    str1[str1Len - nindex] -= str2[str2Len - nindex];
                } else {
                    str1[str1Len - nindex] -= 1;
                    str1[str1Len - nindex] -= (str2[str2Len - nindex] - n);
                }
                nindex++;
            }
            System.out.println(0);
            for (char c : str1) {
                System.out.print(valueStr[c]);
            }
        } else if (nret < 0) {
            for (int i = 0; i < str1Len; i++) {
                if (str2[str2Len - nindex] >= str1[str1Len - nindex]) {
                    str2[str2Len - nindex] -= str1[str1Len - nindex];
                } else {
                    str2[str2Len - nindex] -= 1;
                    str2[str2Len - nindex] -= (str1[str1Len - nindex] - n);
                }
                nindex++;
            }
            System.out.println(1);
            for (char c : str2) {
                System.out.print(valueStr[c]);
            }
        } else {
            System.out.println("0 0");
        }
        System.out.println();
    }

}

