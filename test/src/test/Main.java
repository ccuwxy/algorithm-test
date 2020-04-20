package test;////import java.util.*;
////
////public class test.Main {
////    //    public static void main(String[] args) {
//////        Scanner sc = new Scanner(System.in);
//////        String str = sc.nextLine();
////////        String str = "32,321";
//////        String[] s = str.split(",");
//////        List<String> list = new ArrayList<>();
//////        list.addAll(Arrays.asList(s));
//////        list.sort(new Comparator<String>() {
//////            @Override
//////            public int compare(String o1, String o2) {
//////                int length1 = o1.length();
//////                int length2 = o2.length();
//////                int min = Math.min(length1, length2);
//////                for (int i = 0; i < min; i++) {
//////                    if(o1.charAt(i) < o2.charAt(i)){
//////                        return -1;
//////                    }else if(o1.charAt(i) > o2.charAt(i)){
//////                        return 1;
//////                    }
//////                }
//////                return length1 <length2 ? 1 : -1;
//////            }
//////        });
//////        for (String s1 : list) {
//////            System.out.print(s1);
//////        }
//////    }
////    private static int maxV = 0;
////    private static int maxW = 0;
////    private static int n = 0;
////    private static int[] w = new int[n];
////    private static int[] v = new int[n];
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
//////        n = sc.nextInt();
////        int m = sc.nextInt();
////
////        for (int i = 0; i < n; i++) {
////            w[i] = sc.nextInt();
////        }
////        for (int i = 0; i < n; i++) {
////            v[i] = sc.nextInt();
////        }
////        List<Integer>[] list = new ArrayList<>()[];
////
////        for (int i = 0; i < n; i++) {
////            add(i);
////        }
////
////    }
////
////    public static int add(int c){
////        if (c == n){
////            return 0;
////        }
////        if(maxW>10){
////            return add(c+1);
////        }
////        maxV += v[c];
////        return add(c+1);
////    }
////
////}
////
////
////
////
//
////import java.util.*;
////
////public class test.Main {
////    private static int count = 0;
////    private static int x = 0;
////    private static int y = 0;
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        x = sc.nextInt();
////        y = sc.nextInt();
////        System.out.println(dp(0, 0));
////    }
////
////    public static int dp(int a, int b) {
////        if (x == 0 && y == 0) {
////            return 0;
////        }
////        if (a != x) {
////            dp(a + 1, b);
////        }
////        if (b != y){
////            dp(a, b + 1);
////        }
////        if(a==x && b == y){
////            count++;
////            return 0;
////        }
////        return count;
////    }
////}
//
////import java.util.*;
////public class test.Main{
////    public static void main(String[] args){
////       Scanner sc = new Scanner(System.in);
////       int i = sc.nextInt();
////       int count = 0;
////       int bit = 32;
////       while (bit!=0){
////           if((i & 1) == 1){
////               count++;
////           }
////           i = (i >>> 1);
////           bit--;
////       }
////        System.out.println(count);
////    }
////}
//
////import java.util.*;
////
////public class test.Main {
////    private static int x;
////    private static int y;
////    private static int k;
////    private static int n1;
////    private static int n2;
////    private static int n3;
////    private static int n4;
////    private static int counta = 0;
////    private static int countb = 0;
////    private static boolean flag = false;
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        x = sc.nextInt();
////        y = sc.nextInt();
////        k = sc.nextInt();
////        System.out.println(re(0, 0));
////
////    }
////
////    public static int re(int a, int b) {
//////        if (a == x && b == y)
//////            return 0;
////        n1 = a / 10;
////        n2 = a % 10;
////        n3 = b / 10;
////        n4 = b % 10;
////        if (n1 + n2 + n3 + n4 > k)
////            return -1;
////        if (a < x) {
////            if (re(a + 1, b) != -1)
////                counta++;
////        }
////        if (b < y) {
////            if (re(a , b+ 1) != -1)
////                countb++;
////        }
////        if(counta==0)
////            return countb;
////        if(countb==0)
////            return counta;
////        return counta*(countb+1);
////    }
////
////}
//
//import java.util.*;
//import java.math.*;
//public class test.Main {
////    public String PrintMinNumber(int[] numbers) {
////        List<Integer> list = new ArrayList<>();
////        for (int number : numbers) {
////            list.add(number);
////        }
////        list.sort((o1,o2)->(o1+""+o2+"").compareTo(o2+""+o1+""));
////        StringBuilder sb = new StringBuilder();
////        for (Integer integer : list) {
////            sb.append(integer);
////        }
////        return sb.toString();
////    }
//
////
////    Stack<Integer> stack1 = new Stack<Integer>();
////    Stack<Integer> stack2 = new Stack<Integer>();
////
////    public void push(int node) {
////        stack1.push(node);
////        stack2.push(stack1.pop());
////    }
////
////    public int pop() {
////
////    }
//
//    //    public int NumberOf1Between1AndN_Solution(int n) {
////        int count = 0;
////        for(int i = 1; i <= n; i *= 10){
////            int a = n / i, b = n % i;
////            count += (a + 8) / 10 * i + (a % 10 == 1?1:0) * (b + 1);
////        }
////        return count;
////    }
////
////    public static void main(String[] args) {
////        String str = "abc";
////        System.out.println(str.length());
////        char[] chs = {'a','b'};
////        System.out.println(chs.length);
////        for (char ch : chs) {
////            System.out.println(ch);
////        }
////
////        System.out.println(str.lastIndexOf("c"));
////        System.out.println(str.indexOf("c"));
////
////
////    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.next();
//        String str2 = sc.next();
//        int a,b;
//        int[] ints = new int[Math.max(str1.length() ,str2.length() )];
//        List<String> list = new ArrayList<>();
////
////        if (str1.length() != str2.length()) {
////            System.out.println("false");
////            return;
////        }
////        char[] chars1 = str1.toCharArray();
////        char[] chars2 = str2.toCharArray();
////        Map<Character, Integer> map1 = new HashMap<>();
////        Map<Character, Integer> map2 = new HashMap<>();
////
////        for (char c : chars1) {
////            if (map1.containsKey(c)) {
////                map1.put(c, map1.get(c) + 1);
////            } else {
////                map1.put(c, 1);
////            }
////        }
////
////        for (char c : chars2) {
////            if (map2.containsKey(c)) {
////                map2.put(c, map2.get(c) + 1);
////            } else {
////                map2.put(c, 1);
////            }
////        }
////        Set<Map.Entry<Character, Integer>> entries1 = map1.entrySet();
////        boolean bool = true;
////        for (Map.Entry<Character, Integer> e1 : entries1) {
////            Character key = e1.getKey();
////            if (map2.get(key) == e1.getValue()) {
////                continue;
////            } else
////                bool = false;
////        }
////        System.out.println(bool);
////    }
//        for (int i = 0; i < str1.length(); i++) {
//            for (int test.j = 0; test.j < str2.length(); test.j++) {
//                a = i;
//                b = test.j;
//                if(str1.charAt(i)==str2.charAt(test.j)){
//                    while (str1.charAt(a)==str2.charAt(b)) {
//                        if(a < str1.length()-1 && b < str2.length()-1){
//                            a++;
//                            b++;
//                        }else {
//                            break;
//                        }
//                    }
//                    list.add(str1.substring(i,a));
//                }
//            }
//        }
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if(o1.length()>o2.length())
//                return -1;
//                else if(o1.length()==o2.length())
//                     return o1.compareTo(o2);
//                else return 0;
//            }
//        });
//        int length = list.get(0).length();
//        for (String s : list) {
//            if(s.length()==length)
//                System.out.println(s);
//        }
//    }
//
//}

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 4, 7, 8, 11, 15};
//        find(nums, 3);
        Date date = new Date();
        System.out.printf("%tD%n", date);
        String str =
                "";
        System.out.print(str.split(",").length);
    }

    public static void find(int[] nums, int target) {
        List<int[]> list = new ArrayList<>();
        int a, b;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                a = nums[i];
                b = nums[j];
                if (b - a == target) {
                    list.add(new int[]{a, b});
                }
            }
        }
        if (list.isEmpty())
            list.add(new int[]{-1, -1});
        for (int i = 0; i < list.size(); i++) {
            System.out.print("[" + list.get(i)[0] + "," + list.get(i)[1] + "]");
            if (i != list.size() - 1)
                System.out.print(",");
        }
    }

    public static void test(ListNode node) {
        Stack<Integer> stack = new Stack<>();
        ListNode head = node;
        while (head != null) {
            stack.push(head.value);
            head = head.next;
        }
        while (node != null) {
            if (stack.pop() != node.value) {
                System.out.println("false");
                return;
            }
            node = node.next;
        }
        System.out.println("true");
    }

    public static void delete(ListNode node, int k) {
        int i = 0;
        if (k == 1) {
            node = node.next;
            test(node);
            return;
        }
        ListNode head = node;
        while (head != null) {
            i++;
            if (i == k) {
                head.next = head.next.next;
                test(node);
            }
            head = head.next;
        }

    }

}


class ListNode {
    int value;
    ListNode next;
}