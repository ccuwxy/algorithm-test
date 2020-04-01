package test;


import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.*;

public  class l{
    public static void main(String[] args) throws ClassNotFoundException {
        Stack<Integer> s = new Stack<>();
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int temp;
        while (num != 0){
            temp = (int) (num % 10);
            num /= 10;
            s.push(temp);
        }
        int t;
        String[] st = new String[]{"zero",};
        while (!s.isEmpty()){
            t = s.pop();
            Set<String> set = new LinkedHashSet<>();
            set.add("1");
            for (String s1 : set) {
                System.out.println(s1);
            }
            System.out.println(st[t]+" ");
        }

    }
}