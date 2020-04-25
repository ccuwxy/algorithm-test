package nowcoder.dfcf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class t2 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] count = new int[128];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        while (count['z']!=0){
            count['z']--;
            count['e']--;
            count['r']--;
            count['o']--;
            list.add(0);
        }
        while (count['w']!=0){
            count['t']--;
            count['w']--;
            count['o']--;
            list.add(2);
        }
        while (count['x']!=0){
            count['s']--;
            count['i']--;
            count['x']--;
            list.add(6);
        }
        while (count['u']!=0){
            count['f']--;
            count['o']--;
            count['u']--;
            count['r']--;
            list.add(4);
        }
        while (count['s']!=0){
            count['s']--;
            count['e']--;
            count['v']--;
            count['e']--;
            count['n']--;
            list.add(7);
        }
        while (count['o']!=0){
            count['o']--;
            count['n']--;
            count['e']--;
            list.add(1);
        }
        while (count['r']!=0){
            count['t']--;
            count['h']--;
            count['r']--;
            count['e']--;
            count['e']--;
            list.add(3);
        }
        while (count['f']!=0){
            count['f']--;
            count['i']--;
            count['v']--;
            count['e']--;
            list.add(5);
        }
        while (count['t']!=0){
            count['e']--;
            count['i']--;
            count['g']--;
            count['h']--;
            count['t']--;
            list.add(8);
        }
        while (count['e']!=0){
            count['n']--;
            count['i']--;
            count['n']--;
            count['e']--;
            list.add(9);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }
}
