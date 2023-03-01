package 集合04.大作业05.HashSet03;

/*
当我们在京东注册新用户的时候,我们输入一个要注册的用户名,如果之前有该用户名注册过,
京东是不会让相同的用户名注册的,会注册失败.根据以上描述,设计程序,完成注册功能!
 */


import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>();

        Collections.addAll(users, new User("齐天大圣", "12364"), new User("猪八戒", "56359"));
        System.out.println(users);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册用户名：");
        String name = sc.next();
        System.out.println("请输入注册密码：");
        String password = sc.next();

        if (users.add(new User(name, password))) {
            System.out.println("注册成功！");
        } else {
            System.out.println("注册失败！");
        }
        System.out.println(users);
    }
}
