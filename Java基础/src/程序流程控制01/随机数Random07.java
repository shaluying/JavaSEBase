package 程序流程控制01;

import java.util.Random;
import java.util.Scanner;

public class 随机数Random07 {
    public static void main(String[] args) {
        // 目标：学会使用Java提供的随机数类Random
        // 1、导包
        // 2、创建随机数对象
        Random r = new Random();

        // 3、调用nextInt功能（方法）可以返回一个整型的随机数给你
        for (int i = 0; i < 20; i++) {
            int data = r.nextInt(10); // 0 - 9 不包含10的（包前不包后）
            System.out.print(data + "\t");
        }
        System.out.println("----------------------------------");
        // 1 - 10 ==> -1 ==> (0 - 9) + 1
        int data = r.nextInt(10) + 1;
        System.out.println(data);

        // 3 - 17 ==> -3 ==> (0 - 14) + 3
        int data1 = r.nextInt(15) + 3;
        System.out.println(data1);

        // 猜1-100之间数字，猜大提示大，猜小提示小，直到猜中
        Scanner sc = new Scanner(System.in);

        int luckNumber = r.nextInt(100) + 1;


        while (true) {
            System.out.println("请猜测一个1-100之间的数字：");
            int guessNumber = sc.nextInt();
            if (guessNumber == luckNumber) {
                System.out.println("就是：" + guessNumber + "猜对了");
                break;
            } else if (guessNumber > luckNumber) {
                System.out.println("猜大了");
            } else if (guessNumber < luckNumber) {
                System.out.println("猜小了");
            }
        }


    }
}
