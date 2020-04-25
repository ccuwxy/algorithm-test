package test;

import java.util.Scanner;

public class ThreeThread {

    static int i = 0;
    static int n;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Thread t1 = new Thread(ThreeThread::find);
        Thread t2 = new Thread(ThreeThread::find);
        Thread t3 = new Thread(ThreeThread::find);

        t1.start();
        t2.start();
        t3.start();

    }

    public static synchronized void find(){
        int flag = 0;
        while (i < n) {
            i++;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (n % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(i);
                System.out.println(Thread.currentThread().getName());
                break;
            }
        }
    }

}
