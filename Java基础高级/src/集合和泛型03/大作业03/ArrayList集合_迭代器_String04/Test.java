package 集合和泛型03.大作业03.ArrayList集合_迭代器_String04;

/*
模拟注册用户,如果存在要注册的用户,直接显示"对不起,您注册的用户已经存在!请直接登录!",可以继续注册;
 如果不存在要注册的用户,显示"注册成功!",并将所有用户的信息显示出来!

 1.往集合中存储3个用户-->准备数据
  "小明", "123"
  "小红", "456"
  "小勇", "789"
2.通过键盘录入的形式输入要注册的用户名和密码
  如果集合中有输入的用户名和密码,证明已经注册了
  否则,没有注册,并将其添加到集合中
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("小明", "123"));
        list.add(new User("小红", "456"));
        list.add(new User("小勇", "789"));
        showUser(list);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入注册用户名：");
            String inputName = sc.next();

            if (isUser(list, inputName)) {
                System.out.println("用户名已经被注册请重新输入！");
            } else {
                System.out.println("请输入密码：");
                String inputPassword = sc.next();
                list.add(new User(inputName, inputPassword));
                System.out.println("注册成功");
                showUser(list);
                break;
            }

        }
    }


    public static boolean isUser(List<User> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            String userName = list.get(i).getName();
            if (name.equals(userName)) {
                return true;
            }
        }

        return false;
    }

    public static void showUser(List<User> list) {
        Iterator<User> it = list.iterator();
        while (it.hasNext()) {
            User user = it.next();
            System.out.println(user.getName() + "：" + user.getPassword());
        }
    }


}
