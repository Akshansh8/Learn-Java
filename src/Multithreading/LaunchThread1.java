package Multithreading;

import java.util.Scanner;

class Banking implements Runnable
{
    public void run()
    {
        System.out.println("Activity 1 started");

        Scanner sc = new Scanner(System.in);
        System.out.println("enter account number");
        int ac = sc.nextInt();
        System.out.println("enter account password");
        int pw = sc.nextInt();

        System.out.println("please see the account details");

        System.out.println("Activity 1 ended");


    }
}

class PrintingNum implements Runnable
{

    public void run(){
        System.out.println("Activity 2 started");
        for(int i = 1;i<=5;i++){
            System.out.println(i);
            try
            {
                Thread.sleep(3000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Activity 2 ended");
    }
}

class PrintingAlpha implements Runnable{
    public void run(){
        System.out.println("Activity 3 stared");

        for(int i = 65; i<70;i++) {
            System.out.println((char) i);

            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Activity 3 ended");
    }
}
public class LaunchThread1 {
    public static void main(String[] args) throws Exception {
        Banking b = new Banking();
        PrintingNum pn = new PrintingNum();
        PrintingAlpha pa = new PrintingAlpha();
         Thread t1 = new Thread(b);
         Thread t2 = new Thread(pn);
         Thread t3 = new Thread(pa);

         System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
         t1.start();
         t2.start();
         t3.start();

        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());
        System.out.println(t3.isAlive());
        t1.join();
        t2.join();
        t3.join();
        System.out.println("Resoureces closed");
        System.out.println("Main thread over");





    }
}
