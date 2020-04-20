import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class aaa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        while(num!=0){
            list.add(num%15);
            num /= 15;
        }
        StringBuilder sb = new StringBuilder("");
        for (int i = list.size()-1; i >=0 ; i--) {
            int temp = list.get(i);
            if (temp == 10){
                sb.append('A');
            }else if (temp == 11){
                sb.append('B');
            }else if (temp == 12){
                sb.append('C');
            }else if (temp == 13){
                sb.append('D');
            }else if (temp == 14){
                sb.append('E');
            }else{
                sb.append(temp);
            }
        }
        System.out.println(sb.toString());
    }
}
