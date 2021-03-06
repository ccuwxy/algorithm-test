package nowcoder.kuaishou2020;

import java.util.ArrayList;
import java.util.List;

public class t2 {
    /**66.67
     * 返回无重复幂因子的 N进制完美数之和的所有幂因子
     *
     * @param R int整型
     * @param N int整型 N进制
     * @return int整型一维数组
     */


    public static int[] GetPowerFactorNew (int R, int N) {
        // write code here

        if(R == 1) return new int[]{0};
        if(N > R) return new int[0];
        int count = 0, curr = 1;
        while (curr < R){
            curr *= N;
            count++;
        }
        if(curr == R) return new int[]{count};
        curr /= N;
        count--;
        ArrayList<Integer> res = new ArrayList<>();
        while (R >= N){
            boolean added = false;
            if (R >= curr){
                res.add(count);
                R -= curr;
                added = true;
            }
            if(added && R >= curr) return new int[0];
            curr /= N;
            count--;
        }
        if(R > 1) return new int[0];
        else if(R == 1) res.add(0);
        int[] ans = new int[res.size()];
        int j = 0;
        for (int i = res.size() - 1; i >= 0; i--) {
            ans[j++] = res.get(i);
        }
        return ans;
    }

    public static int[] GetPowerFactor(int R, int N) {
        int num = R;
        int temp;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < R; i++) {
            temp = pow(N, i);
            if (temp < R) {
                list.add(temp);
            } else if (temp == R) {
                return new int[]{temp};
            } else {
                break;
            }
        }

        List<Integer> ans = get(list,R);
        int [] anss = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            anss[i] = ans.get(i);
        }
        return anss;
    }

//    public static void numGroup(List<Integer> li, int start, int length, int sum) {
//        if (sum==0){
//            for (int j = 0; j < index;j++){
//                System.out.println(flag[j]);
//            }
//        }
//        if (sum != 0) {
//            for (int i = start; i < length; i++) {
//                flag[index++] = li.get(i);
//                numGroup(li, i + 1, length - 1, sum - li.get(i));
//            }
//        }
//        index--;
//    }

    static List<Integer> get(List<Integer> keys, int k) {
        int n = keys.size();
        int b = 1 << n;
        int in;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < b; i++) {
            in = 0;
            list.clear();
            for (int j = 0; j < n; j++) {
                int tem = 1 << j;
                if ((tem & i) != 0) {
                    in += keys.get(j);
                    list.add(j);
                }
            }
            if (in == k)
                return list;
        }
        return list;
    }

    public static int pow(int a, int b) {
        int sum = 1;
        for (int i = 0; i < b; i++) {
            sum *= a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = GetPowerFactor(1, 3);

        for (int i : a) {
            System.out.println(i);
        }
    }
}