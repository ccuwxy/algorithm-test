package leetcode.leetcode3;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. 无重复字符的最长子串
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * <p>
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * <p>
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 * 请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Solution3 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("abcabcbbaefdsa"));
    }
}

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 1 || s.length() == 0)
            return s.length();
//        HashMap<Character, Integer> map = new HashMap<>();
//        int left = 0;
//        int max = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (map.containsKey(s.charAt(i))) {
//                left = Math.max(left, map.get(s.charAt(i)) + 1);
//            }
//            map.put(s.charAt(i), i);
//            max = Math.max(max, i - left + 1);
//        }
        int max = 0;
        int len = s.length();
        int[] map = new int[128];
        for (int i = 0, j = 0; j < len; j++) {
            int step = s.charAt(j);
            i = Math.max(map[step],i);
            map[step] = j+1;
            max = Math.max(max,j-i+1);
        }
        return max;
    }
}