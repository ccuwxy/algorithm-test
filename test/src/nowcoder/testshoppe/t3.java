package nowcoder.testshoppe;

import java.util.Scanner;

/**
 * LeetCode 1262
 */
public class t3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] nums = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            nums[i] = Integer.parseInt(s[i]);
        }
        System.out.println(max(nums));
    }

    //能被三整除的元素最大和
    public static int max(int[] nums) {
        int dp[] = new int[4];
        dp[0] = 0;
        dp[1] = dp[2] = -10000;
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i] % 3;
            int a = dp[(0 - t + 3) % 3];
            int b = dp[(1 - t + 3) % 3];
            int c = dp[(2 - t + 3) % 3];
            dp[0] = Math.max(dp[0],a+nums[i]);
            dp[1] = Math.max(dp[1],b+nums[i]);
            dp[2] = Math.max(dp[2],c+nums[i]);
        }
        return dp[0];
    }
}
