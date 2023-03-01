package 常用API01.String01.String练习案例02.模拟用户登录02;

/*
模拟用户登录功能，最多只给三次机会
 */

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        String okName = "admin";
        String okPassword = "123456";
        Scanner sc = new Scanner(System.in);


        int total = 0;
        while (true) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String password = sc.next();

            if (okName.equals(name) && okPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                total += 1;
            }
            if (total == 3) {
                System.out.println("错误次数太多，已锁定！");
                break;
            } else if (total < 3) {
                System.out.println("登录失败，账号或密码错误，请重新输入！");
            }
        }
    }
}
