package nowcoder.qianxin2020;

import java.util.Scanner;

public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if (n >= 1){
            n -= 1;
            count += 5;
        }
        if (n>=2){
            n -= 2;
            count += 3;
        }
        if (n>=2){
            n -= 2;
            count += 3;
        }

        int flag = 0;
        int flag1 = 0;
        if (n >=5){
            n-=5;
            count += 4;
        }else if (n>=2){
            flag1 = 1;
            n -= 2;
            count += 2;
        }else if(n >= 3){
            flag = 1;
            n -= 3;
            count +=1;
        }
        if (flag1 !=1 && n >= 2){
            n -= 2;
            count += 2;
        }
        if (flag !=1 && n >= 3){
            n-=3;
            count+=1;
        }
        System.out.println(count);

    }
}
