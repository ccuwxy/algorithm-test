package nowcoder.kuaishousx2020;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<String> set = new HashSet<>();
        HashSet<String> set1 = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String next = sc.next();
            String[] split = next.split("/");
            String[] split1 = next.split("\\.");
            set1.add(split1[0]);
            set.add(split[0]+"/"+split[1]+"/"+split[2]);
        }
        System.out.println(set1.size());
        for (String s : set) {
            System.out.print(s);
            System.out.print(" ");
        }
    }
}
