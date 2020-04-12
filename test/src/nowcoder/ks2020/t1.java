package nowcoder.ks2020;

import java.util.Scanner;
import java.util.Stack;

/**100
 * 括号统计
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        int leftNum = 0;
        int rightNum = 0;
        int num = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            if (str.charAt(i)=='('){
                leftNum++;
                stack.push('(');
            }else if (str.charAt(i)==')'){
                rightNum++;
                if (!stack.isEmpty() && stack.peek()=='('){
                    leftNum--;
                    rightNum--;
                    stack.pop();
                    num++;
                }else {
                    stack.push(')');
                }
            }
        }
        System.out.println(num+" "+leftNum+" "+rightNum);

    }
}
