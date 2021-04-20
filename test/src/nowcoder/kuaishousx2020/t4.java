package nowcoder.kuaishousx2020;

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] area = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                area[i][j] = sc.nextInt();
            }
        }

        int count = 0;
        for (int i = 1; i < x - 1; i++) {
            for (int j = 1; j < y - 1; j++) {
                if (area[i][j] == 1) {
                    if (i==1){
                        if (area[i - 1][j] == 0 && j!=area[0].length-2)
                            count++;
                        else if (area[i - 1][j] == 0 && j==area[0].length-2 && area[i][j+1]==0){
                            count++;
                        }
                    }else if(j==area[0].length-2){
                        if (area[i][j+1]==0)
                            count++;

                    }else
                        count++;
                }
            }
        }
        System.out.println(count);
        int a = area.length - 2;
        int b = 1;
        find(area, a, b);
        System.out.println(count - c);
    }

    /*
    4 4
    0 0 1 1
    0 1 0 1
    0 1 1 0
    0 0 0 1
     */
    static int c = 0;

    private static void find(int[][] area, int x, int y) {
        if (x <= 0 && y >= area[0].length - 1)
            return;
        if (x > 0) {
            if (area[x][y] == 1 && x - 1 != 0 && y != area[0].length - 1)
                c += area[x - 1][y];
            find(area, x - 1, y);
        }
        if (y < area[0].length - 2) {
            if (area[x][y] == 1 && x != 0 && y + 1 != area[0].length - 1)
                c += area[x][y + 1];
            find(area, x, y + 1);
        }


    }
}
