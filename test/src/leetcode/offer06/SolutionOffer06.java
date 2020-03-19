package leetcode.offer06;

/**
 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 示例 1：

 输入：s = "We are happy."
 输出："We%20are%20happy."
 */
public class SolutionOffer06 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.replaceSpace("w x"));

    }

    static class Solution {
        public String replaceSpace(String s) {

            int count = 0;
            for(int i = 0; i < s.length();i++){
                if(s.charAt(i)==' ')
                    count++;
            }

            int sl = s.length();
            int cl = s.length()+count*2;
            char[] chars = new char[cl];
            while (sl>0){
                if(s.charAt(--sl)==' '){
                    chars[--cl] = '0';
                    chars[--cl] = '2';
                    chars[--cl] = '%';
                }else {
                    chars[--cl] = s.charAt(sl);
                }
            }
            return String.valueOf(chars);
        }
    }

}

