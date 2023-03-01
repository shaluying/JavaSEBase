package Java基础综合练习04;
/*
 * 需求：机票价格按照淡季旺季、头等舱和经济舱收费、
 * 输入机票原价、月份和头等舱或经济舱。按照如下规则计算机票价格：
 * 旺季（5-10月）头等舱9折，经济舱8.5折，
 * 淡季（11月到来年4月）头等舱7折，经济舱6.5折。
 */

import java.util.Scanner;

public class 买飞机票01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价：");
        double money = sc.nextDouble();
        System.out.println("请输入月份：");
        int month = sc.nextInt();
        System.out.println("请输入舱位类型：");
        String type = sc.next();

        System.out.println("机票价格是：" + calculate(money, month, type));
    }

    public static double calculate(double money, int month, String type) {
        if (month >= 5 && month <= 10) {
            switch (type) {
                case "头等舱":
                    money *= 0.9;
                    break;
                case "经济舱":
                    money *= 0.85;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
                    money = -1;
            }
        } else if (month == 11 || month == 12 || month >= 1 && month <= 4) {
            switch (type) {
                case "头等舱":
                    money *= 0.7;
                    break;
                case "经济舱":
                    money *= 0.65;
                    break;
                default:
                    System.out.println("您输入的舱位类型有误！");
                    money = -1;
            }
        } else {
            System.out.println("您输入的月份有误！");
            money = -1;
        }
        return money;
    }

}
