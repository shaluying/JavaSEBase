package 程序流程控制01;

import java.util.Scanner;

public class 死循环06 {
    public static void main(String[] args) {
//      一些死循环

//        for (; ; ) {
//            System.out.println("helloworld");
//        }
//
//        经典
//        while (true) {
//            System.out.println("helloworld");
//        }
//
//        do {
//            System.out.println("helloworld");
//        } while (true);

        // 密码为520 ，直到用户输入正确才进入
        Scanner sc = new Scanner(System.in);
        int okPassword = 520;

        while (true) {
            System.out.println("请输入密码：");
            int password = sc.nextInt();

            if (password == okPassword) {
                System.out.println("密码正确");
                break;
            } else {
                System.out.println("密码错误");
            }
        }


    }
}
