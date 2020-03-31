package nowcoder.testshoppe;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class t2 {
//
//    private static String[] s;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        s = str.split(" ");
//
//       range(s,0, s.length);
//    }
//    public static void swap(String[] l,int f,int r){
//        String temp = l[f];
//        l[f] = l[r];
//        l[r] = temp;
//    }
//    public static void range(String[] li,int index,int length){
//        if(index>=length-1){
//            output(li);
//        }else {
//            for (int i = index; i < li.length; i++) {
//                swap(li,index,i);
//                range(li,index+1,length);
//                swap(li,index,i);
//            }
//        }
//    }
//
//    private static void output(String[] li) {
//        for (int i = 0; i < li.length; i++) {
//            if(i!=li.length-1){
//                System.out.print(li[i]+" ");
//            }else
//                System.out.print(li[i]);
//        }
//        System.out.println();
//    }
//
//
//}
//
//
///*
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//
//    private static List<String> list;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        list = new ArrayList<>();
//        for (int i = 0;sc.hasNextLine();i++){
//            list.add(sc.next());
//        }
//       range(list,0, list.size());
//    }
//    public static void swap(List<String> l,int f,int r){
//        String temp = l.get(f);
//        l.set(f,l.get(r));
//        l.set(r,temp);
//    }
//    public static void range(List<String> li,int index,int length){
//        if(index>=length-1){
//            output(li);
//        }else {
//            for (int i = index; i < li.size(); i++) {
//                swap(li,index,i);
//                range(li,index+1,length);
//                swap(li,index,i);
//            }
//        }
//    }
//
//    private static void output(List<String> li) {
//        for (int i = 0; i < li.size(); i++) {
//            if(i!=li.size()-1){
//                System.out.print(li.get(i)+" ");
//            }else
//                System.out.print(li.get(i));
//        }
//        System.out.println();
//    }
//
//
//}
//
// */

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 字符数组全排列
 * ASCII升序
 */
public class t2 {
    public static List<String> list = new LinkedList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        char[] chars = new char[s.length];
        for (int i = 0; i < s.length; i++) {
            chars[i] = s[i].toCharArray()[0];
        }
        getAllOrder(chars, 0, chars.length - 1);
        Collections.sort(list);
        for (String s1 : list) {
            System.out.println(s1);
        }
    }

    public static void getAllOrder(char[] c, int f, int r) {
        if (f == r) {
            output(c);
        } else {
            for (int i = f; i <= r; i++) {
                swap(c, f, i);
                getAllOrder(c, f + 1, r);
                swap(c, i, f);
            }
        }
    }

    private static void output(char[] c) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < c.length; i++) {
            if (i != c.length - 1) {
                sb.append(c[i]+" ");
            } else {
                sb.append(c[i]);
            }
        }
        list.add(sb.toString());
    }

    public static void swap(char[] c, int f, int r) {
        char temp = c[f];
        c[f] = c[r];
        c[r] = temp;
    }
}