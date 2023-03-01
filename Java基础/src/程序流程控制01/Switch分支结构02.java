package 程序流程控制01;

import java.util.Scanner;

public class Switch分支结构02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 目标：学会使用switch分支结构，理解流程
        // 周一：                        周五：今晚吃鸡
        // 周二：请求大牛程序员帮忙         周六：与王婆介绍的小芳相亲
        // 周三：今晚啤酒、龙虾、小烧烤      周日：郁郁寡欢、准备上班。
        // 周四： 主动帮助新来的女程序解决bug

        System.out.println("请输入今天的星期数：");
        String str = sc.next();

        switch (str) {
            case "星期一":
                System.out.println("埋头苦干，解决bug");
                break;
            case "星期二":
                System.out.println("请求大牛程序员帮忙");
                break;
            case "星期三":
                System.out.println("今晚啤酒、龙虾、小烧烤");
                break;
            case "星期四":
                System.out.println("主动帮助新来的女程序解决bug");
                break;
            case "星期五":
                System.out.println("今晚吃鸡");
                break;
            case "星期六":
                System.out.println("与王婆介绍的小芳相亲");
                break;
            case "星期日":
                System.out.println("郁郁寡欢、准备上班。");
                break;
            default:
                System.out.println("输入有误");
                break;
        }

    }
}
