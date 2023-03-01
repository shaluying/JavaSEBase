package 常用API01.String01.String练习案例02.手机号码屏蔽03;

/*
键盘录入一个手机号，将中间四位号码屏蔽，最终效果为：158****3694
 */

import java.util.Scanner;

public class MaskingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号：");
        String phoneNum = sc.next();

        String processNum = phoneNum.replace(phoneNum.substring(3, 7), "****");
        System.out.println(processNum);
    }
}
