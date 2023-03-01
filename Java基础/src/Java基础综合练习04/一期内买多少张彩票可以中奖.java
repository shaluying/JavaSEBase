package Java基础综合练习04;

import java.util.Random;
import java.util.Scanner;

public class 一期内买多少张彩票可以中奖 {
    public static void main(String[] args) {
        int[] luckNumber = creatLuckNumber();
        int count = 0;
        while (true) {
            int[] inputNumber = creatLuckNumber();
            count++;
            System.out.println("购买的第" + count + "张彩票");
            int re = judgeIsLuck(luckNumber, inputNumber);
            switch (re) {
                case -1:
                    System.out.println("很遗憾没有中奖");
                    break;
                case 1:
                    System.out.println("恭喜，您中了一等奖！");
                    return;
                case 2:
                    System.out.println("恭喜，您中了二等奖！");
                    return;
                case 3:
                    System.out.println("恭喜，您中了三等奖！");
                    return;
                case 4:
                    System.out.println("恭喜，您中了四等奖！");
                    return;
                case 5:
                    System.out.println("恭喜，您中了五等奖！");
                    return;
                case 6:
                    System.out.println("恭喜，您中了六等奖！");
                    return;
            }
        }
    }

    // 随机生成一组中奖双色球号码
    public static int[] creatLuckNumber() {
        Random r = new Random();
        int[] luckNumber = new int[7];

        // 生成红色球号码
        for (int i = 0; i < luckNumber.length - 1; i++) {
            while (true) {
                int num = r.nextInt(33)+1;
                if (!isExist(num, luckNumber)) {
                    luckNumber[i] = num;
                    break;
                }
            }
        }

        // 生成蓝色球号码
        luckNumber[6] = r.nextInt(16)+1;
        return luckNumber;
    }

    // 用户自己购买一组双色球号码
    public static int[] userInputNumber() {
        Scanner sc = new Scanner(System.in);
        int[] inputNumber = new int[7];

        // 选择红色球号码
        for (int i = 0; i < inputNumber.length - 1; i++) {
            while (true) {
                System.out.println("请输入第" + (i + 1) + "个红色球号码(1-33)：");
                int redNum = sc.nextInt();
                if (!isExist(redNum, inputNumber) && redNum >= 1 && redNum <= 33) {
                    inputNumber[i] = redNum;
                    break;
                } else if (isExist(redNum, inputNumber)) {
                    System.out.println("红色球号码不能重复请重新输入！");
                } else {
                    System.out.println("请输入正确的红色球号码范围！");
                }
            }
        }

        // 选择蓝色球号码
        while (true) {
            System.out.println("请输入蓝色球号码(1-16)：");
            int buleNum = sc.nextInt();
            if (buleNum >= 1 && buleNum <= 16) {
                inputNumber[6] = buleNum;
                break;
            } else {
                System.out.println("请输入正确的范围！");
            }

        }
        return inputNumber;
    }

    // 判断用户是否中奖
    public static int judgeIsLuck(int[] arrLuck, int[] arrInput) {
        int[] redLuckNum = new int[6];
        int red = 0;
        int blue = 0;
        for (int i = 0; i < redLuckNum.length; i++) {
            redLuckNum[i] = arrLuck[i];
        }
        for (int i = 0; i < arrInput.length - 1; i++) {
            if (isExist(arrInput[i], redLuckNum)) {
                red++;
            }
        }
        if (arrLuck[arrLuck.length - 1] == arrInput[arrInput.length - 1]) {
            blue++;
        }

        if (blue == 0) {
            switch (red) {
                case 4:
                    return 5;
                case 5:
                    return 4;
                case 6:
                    return 2;
            }
        } else if (blue == 1) {
            switch (red) {
                case 0:
                case 1:
                case 2:
                    return 6;
                case 3:
                    return 5;
                case 4:
                    return 4;
                case 5:
                    return 3;
                case 6:
                    return 1;
            }
        }
        return -1;
    }

    // 判断某个元素是否在数组中 在返回true 不在返回false
    public static boolean isExist(int num, int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    // 打印数组内容
    public static void printArray(int[] arr) {
        System.out.print("[");

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i]);
            }
        }

        System.out.println("]");
    }

}
