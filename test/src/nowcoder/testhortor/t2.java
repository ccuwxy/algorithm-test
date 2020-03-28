package nowcoder.testhortor;

import java.util.Scanner;

public class t2 {
    public static void main(String[] args) {
//        int num1 = 0;
//        int num4 = 0;
//        int num5 = 0;
//        Scanner sc = new Scanner(System.in);
//        int n;
//        String str = "";
//        int count = 9999999;
//        int c = 0;
//        while (sc.hasNextInt()) {
//            count = 9999999;
//            n = sc.nextInt();
//            int temp = n;
//            for (int i = 0; i < 3; i++) {
//                temp = n;
//                if (i == 2) {
//                    num5 = temp / 5;
//                    temp %= 5;
//                }
//                if (i == 2 || i == 1) {
//                    num4 = temp / 4;
//                    temp %= 4;
//                }
//
//                num1 = temp;
//                temp %= 1;
//                c = num1 + num4 + num5;
//                if (c < count) {
//                    str = num1 + "," + num4 + "," + num5;
//                    count = c;
//                }
//            }
//
//            System.out.println(str);
//        }
      /*  int coins[] = {1,4,5};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int nums[] = new int[k+1];
        int min = getMinCount(k,coins,nums);
        for(int j = k;j>0;){
            System.out.println(nums[j]+",");
            j = j-nums[j];
        }

    }

    private static int getMinCount(int k, int[] coins, int[] nums) {
        int a[] = new int[k+1];
        a[0] = 0;
        for (int i = 1; i < k + 1; i++) {
            if (i>=coins[0]) {
                a[i] = a[i-coins[0]]+1;
                nums[i] = coins[0];
            }else {
                a[i] = Integer.MAX_VALUE-k;
            }
            for (int j = 1; j < coins.length; j++) {
                if(i >=coins[j] && (a[i]>a[i-coins[j]]+1)){
                    a[j] = a[i-coins[j]]+1;
                    nums[i] = coins[j];
                }
            }

        }
        return a[k];*/
    }
}
