package IO流二08.练习06.自动登录案例03;

/*
需求：写一个自动登陆小案例。

步骤：
将正确的用户名和密码手动保存在本地的userinfo.txt文件中。
保存格式为:username=zhangsan&password=123
让用户键盘录入用户名和密码
比较用户录入的和正确的用户名密码是否一致

如果一致则打印登陆成功，并将用户录入的数据保存到本地cookie.txt文件中。
      	保存格式为：username=zhangsan
	                    password=123
如果不一致则打印登陆失败

再次运行时，则从本地cookie.txt文件中读取第一次保存的数据，实现自动登陆。

 */


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建集合存储文件信息
        Map<String, String> accountInfoList = new HashMap<>();

        //创建字符输入流接通源文件
        Reader fr = new FileReader("Java基础高级\\src\\IO流二08\\练习06\\自动登录案例03\\userinfo.txt");
        BufferedReader br = new BufferedReader(fr);

        //利用字符输入流读取源文件信息
        String info;
        while ((info = br.readLine()) != null) {
            //将读取到的信息进行整理
            String infoUserName = info.substring(0, info.indexOf("&"));
            String infoPassword = info.substring(info.indexOf("&") + 1);

            String userName = infoUserName.substring(infoUserName.indexOf("=") + 1);
            String password = infoPassword.substring(infoPassword.indexOf("=") + 1);

            //将整理好的信息加入集合
            accountInfoList.put(userName, password);
        }

        System.out.println(accountInfoList);
        System.out.println("------------");

        File cookieFile = new File("Java基础高级\\src\\IO流二08\\练习06\\自动登录案例03\\cookie.txt");
        Reader fr2 = new FileReader(cookieFile);
        BufferedReader br2 = new BufferedReader(fr2);

        if (cookieFile.length() == 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String inputName = sc.nextLine();
            System.out.println("请输入密码：");
            String inputPassword = sc.nextLine();

            if (accountInfoList.containsKey(inputName)) {
                if (accountInfoList.get(inputName).equals(inputPassword)) {
                    System.out.println("登录成功！");
                    PrintStream ps = new PrintStream(cookieFile);
                    ps.print("userName=");
                    ps.println(inputName);
                    ps.print("password=");
                    ps.println(inputPassword);
                    ps.close();
                } else {
                    System.out.println("密码输入错误！");
                }
            } else {
                System.out.println("用户不存在！");
            }
        } else {
            String info2 = br2.readLine();
            System.out.println(info2.substring(info2.indexOf("=") + 1) + "登录成功了");
        }

        br.close();
        br2.close();
    }
}
