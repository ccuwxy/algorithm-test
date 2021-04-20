package mybb.hw210418;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class T3 {
    static int k = 0;
    static int[] b = new int[4];
    static String[] str = new String[2000];
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        String timeStr = sc.nextLine();
        int a = timeStr.charAt(0) - '0';
        int b = timeStr.charAt(1) - '0';
        int c = timeStr.charAt(3) - '0';
        int d = timeStr.charAt(4) - '0';
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        HashMap<String,Long> map = new HashMap<>();
        int[] aa = {a, a, a, a, b, b, b, b, c, c, c, c, d, d, d, d};
        C(16, 4, aa);
        for(int i = 0; i < str.length;i++){
            if(str[i]!=null){
                System.out.println(str[i]+" "+i);
                Date currentTime = dateFormat.parse("0000-00-00 "+a+b+":"+c+d);//现在系统当前时间
                Date pastTime = dateFormat.parse("0000-00-00 "+str[i].charAt(0)+str[i].charAt(1)+":"+str[i].charAt(2)+str[i].charAt(3));//过去时间
                //System.out.println(pastTime.getTime()-currentTime.getTime());
                map.put(str[i],pastTime.getTime()-currentTime.getTime());
            }
        }
        List<Map.Entry<String, Long>> list = new ArrayList<>(map.entrySet());
        //降序排序
        list.sort((o1, o2) -> {
            //return o1.getValue().compareTo(o2.getValue());
            return o2.getValue().compareTo(o1.getValue());
        });

        for (Map.Entry<String, Long> mapping : list) {
            System.out.println(mapping.getKey() + ":" + mapping.getValue());
        }
    }

    static void C(int m, int n, int[] a) {
        int i, j;
        for (i = n; i <= m; i++) {
            b[n - 1] = i - 1;
            if (n > 1)
                C(i - 1, n - 1, a);
            else {
                str[k++] = a[b[0]]+""+a[b[1]]+""+a[b[2]]+""+a[b[3]];
            }
        }
    }
}

