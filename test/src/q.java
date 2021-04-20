import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class q {
/*
2
2
1 3
1 4
3
1 5
1 1
2 3
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t,n;
        t = sc.nextInt();
        while(t-->0){
            int num = 1;
            n = sc.nextInt();
            int l1,l2;
            for(int i = 0; i < n;i++){
                l1 = sc.nextInt();
                l2 = sc.nextInt();
                if(num>=l1&&num <=l2){
                    System.out.print(num++);
                }else
                    System.out.print(0);
                if(i!=n-1)
                    System.out.print(" ");
                else
                    System.out.println();

            }
        }
    }

    /*
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        ArrayList<int> l1 = new ArrayList<int>(n);
        for(int i = 1; i <= n;i++)
        {

        }
    }*/
}
