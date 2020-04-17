package acmcoder.meituan2020;

import java.util.HashSet;
import java.util.Scanner;

/**45%
 * 单科成绩优秀奖
 * 时间限制：C/C++语言 1000MS；其他语言 3000MS
 * 内存限制：C/C++语言 65536KB；其他语言 589824KB
 * 题目描述：
 * 某学校的期末考试共有n个学生参加，考试科目共有m科。学校将会给一部分学生颁发单科成绩优秀奖，获奖学生需要满足的条件是某一科的成绩是所有学生中最高的或是最高的之一。
 * <p>
 * 请问学校应该给多少名学生颁发单科成绩优秀奖。
 * <p>
 * 输入
 * 输入第一行包含两个正整数n和m，分别代表学生人数和考试科目数量。(n,m<=500)
 * <p>
 * 接下来有n行，每行有m个正整数，每个正整数在1-100之间，中间用空格隔开，表示每个学生的m科考试成绩。
 * <p>
 * 输出
 * 输出仅包含一个整数，表示获得单科成绩优秀奖的人数
 * <p>
 * <p>
 * 样例输入
 * 5 5
 * 28 35 38 10 19
 * 4 76 72 38 86
 * 96 80 81 17 10
 * 70 64 86 85 10
 * 1 93 19 34 41
 * 样例输出
 * 4
 * <p>
 * 提示
 * 注意，输出结果为人数，并非人次。同一个学生如有多科最优，获奖人数也只会计为1人，即输出结果始终小于等于n
 */
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] score = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    score[i][j] = sc.nextInt();
                }
            }
            int[] anss = new int[n];
//        HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < m; i++) {
                int temp = 0;
                for (int j = 0; j < n; j++) {
                    if (score[temp][i] < score[j][i])
                        temp = j;
                }
//            set.add(temp);
                anss[temp] = 1;
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (anss[i] == 1) {
                    ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
