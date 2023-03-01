package 数组02;

import java.util.Random;
import java.util.Scanner;

public class 数组练习找最值排序及数组颠倒05 {
    public static void main(String[] args) {
        // 需求：数组元素求和
        int[] money = {16, 32, 8, 100, 78};

        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);
        System.out.println("-------------------------");


        // 需求：数组元素求最值。
        int[] faceScore = {15, 9000, 10000, 20000, 9500, -5};

        int max = faceScore[0];
        for (int i = 0; i < faceScore.length; i++) {
            if (max < faceScore[i]) {
                max = faceScore[i];
            }
        }
        System.out.println(max);
        System.out.println("----------------------");


        // 需求：升序排序数组元素。选择排序
//        int[] faceScore01 = {15, 900, 12050, 22300, 2500, -236};
//
//        for (int i = 0; i < faceScore01.length - 1; i++) {
//            for (int j = i + 1; j < faceScore01.length; j++) {
//                if (faceScore01[i] > faceScore01[j]) {
//                    int temp = faceScore01[i];
//                    faceScore01[i] = faceScore01[j];
//                    faceScore01[j] = temp;
//                }
//            }
//        }

        // 需求：升序排序数组元素。冒泡排序
        int[] faceScore02 = {15, 900, 12050, 22300, 2500, -236};

        for (int i = 0; i < faceScore02.length - 1; i++) {
            for (int j = 0; j < faceScore02.length - i - 1; j++) {
                if (faceScore02[j] > faceScore02[j+1]) {
                    int temp = faceScore02[j];
                    faceScore02[j] = faceScore02[j+1];
                    faceScore02[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < faceScore02.length; i++) {
            System.out.print(faceScore02[i] + "\t");
        }
        System.out.println();
        System.out.println("-------------------------");


        // 需求：数组反转
        int[] arr = {4, 8, 9, 5, 6, 3, 58, 96};

        System.out.println("原数组是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

//        for (int i = 0; i < arr.length / 2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[arr.length - 1 - i];
//            arr[arr.length - 1 - i] = temp;
//        }
        for (int i = 0, j = arr.length - 1 - i; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("反转后数组是：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------");


        // 需求：数组中储存5个 1-20之间的随机数，让用户猜测其中一个
        // 猜中要提示猜中，还要输出该数据在数组中第一次出现的索引，
        // 并打印数组的内容出来。
        // 没有猜中继续。
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[] date = new int[5];
        for (int i = 0; i < date.length; i++) {
            date[i] = r.nextInt(1);
        }

        OUT:
        while (true) {
            System.out.println("请您猜测一个1-20之间的数：");
            int guessDate = sc.nextInt();
            for (int i = 0; i < date.length; i++) {
                if (guessDate == date[i]) {
                    System.out.println("恭喜你，猜对了，对应数组中的索引是：" + i);
                    break OUT;
                }
            }

            System.out.println("很遗憾没猜对，请重新猜测！");
        }

        for (int i = 0; i < date.length; i++) {
            System.out.print(date[i] + "\t");
        }
        System.out.println();
        System.out.println("------------------------------");


    }
}