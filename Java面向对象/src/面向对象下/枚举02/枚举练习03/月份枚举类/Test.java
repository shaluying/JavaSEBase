package 面向对象下.枚举02.枚举练习03.月份枚举类;

/*
在测试类中，从键盘输入年份和月份值，获取对应的月份对象，
并打印月份对象，并获取月份总天数。
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("请输入年份：");
        int year = sc.nextInt();
        boolean leayYear = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;

        System.out.print("请输入与月份：");
        int month = sc.nextInt();

        Month mon = Month.getByValue(month);
        System.out.println(mon);
        System.out.println(mon.length(leayYear));

//        new Month("aa"); enum关键字枚举类的构造器默认修饰符是private
    }
}
