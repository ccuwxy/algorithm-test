package nowcoder.ctrip2019;

import java.util.*;

/**
 * 有一批订单记录，数据有订单号，入店时间，离店时间；
 * 输入一个时间值A，需要在这批记录中找到符合入离店时间范围（A大于等于入店时间，并且A小于等于离店时间）内的所有记录。 单次查询时间复杂度控制在O(logN)
 * ※注意：订单号升序输出
 */
public class t21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        List<Integer> num = new LinkedList<>();
        List<Integer> r = new LinkedList<>();
        List<Integer> c = new LinkedList<>();
        List<Integer> res = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
            r.add(sc.nextInt());
            c.add(sc.nextInt());
            if (a >= r.get(i) && a <= c.get(i))
                res.add(num.get(i));
        }
        if (res.isEmpty())
            System.out.println("null");
        else {
            Collections.sort(res);
            for (Integer re : res) {
                System.out.println(re);
            }
        }
    }
}
