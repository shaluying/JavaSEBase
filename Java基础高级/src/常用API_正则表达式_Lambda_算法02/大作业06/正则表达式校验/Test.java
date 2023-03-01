package 常用API_正则表达式_Lambda_算法02.大作业06.正则表达式校验;

/*
在京东上注册的时候,页面会显示以上输入框,需要我们注册用户名,密码以及邮箱.
而且,如果我们输入的不符合京东的规定,那么注册会失败!根据所学知识,完成类似需求.
要求:只需要校验用户名,密码以及邮箱(无需验证确认密码以及邮箱验证码)
    用户名:必须是大小写字母,数字,_组合 3到16个字符
    密码:开头必须是大小写字母,或者数字,后面加1个或者多个
        然后再加一个或者多个大小写字母,数字
    邮箱:：@前面可以是数字，字母，下划线。@后面是字母和.
          talta@sina.com.cn
 */

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请输入用户名：");
            String useName = sc.next();
            if (checkUserName(useName)) {
                break;
            } else {
                System.out.println("用户名格式有误！");
            }
        }
        while (true) {
            System.out.println("请输入密码：");
            String password = sc.next();
            if (checkPassword(password)) {
                break;
            } else {
                System.out.println("密码格式输入有误！");
            }
        }
        while (true) {
            System.out.println("请输入邮箱：");
            String email = sc.next();
            if (checkEmail(email)) {
                System.out.println("注册成功！");
                break;
            } else {
                System.out.println("邮箱输入格式有误");
            }
        }

    }

    public static boolean checkEmail(String userName) {
        return userName.matches("\\w{2,}@[a-zA-Z]+\\.com(\\.cn)?");
    }

    public static boolean checkPassword(String userName) {
        return userName.matches("[\\w&&[^_]][\\w&&[^_]]+");
    }

    public static boolean checkUserName(String password) {
        return password.matches("[a-z0-9A-Z_]{3,16}");
    }


}
