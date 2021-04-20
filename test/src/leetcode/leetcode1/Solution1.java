package leetcode.leetcode1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution1 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i < nums.length;i++){
            int temp = target-nums[i];
            if(map.containsKey(temp)&&map.get(temp)!=i){
                return new int[] {i,map.get(temp)};
            }
        }
        return null;
    }
}
