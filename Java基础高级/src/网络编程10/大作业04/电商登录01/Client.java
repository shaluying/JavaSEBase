package 网络编程10.大作业04.电商登录01;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        File file = new File("Java基础高级\\src\\网络编程10\\大作业04\\电商登录01\\user.properties");

        //判断路径是否存在
        if (file.exists()) {//存在
            //登录
            login();
        } else {//不存在
            //注册账户
            register();
        }


    }

    private static void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入");

        try {
            //向服务端发送连接请求
            Socket socket = new Socket("169.254.142.0", 8848);
            PrintStream ps = new PrintStream(socket.getOutputStream());

            //连接服务端发送登录请求
            ps.println("login");

            //发送用户名
            System.out.println("用户名：");
            String username = sc.nextLine();
            ps.println(username);

            //发送密码
            System.out.println("密码：");
            String password = sc.nextLine();
            ps.println(password);

            BufferedReader bf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mes = bf.readLine();
            System.out.println(mes);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请注册");

        try {
            //向服务端发送连接请求
            Socket socket = new Socket("169.254.142.0", 8848);
            PrintStream ps = new PrintStream(socket.getOutputStream());

            //连接服务端发送注册请求
            ps.println("register");

            //发送用户名
            System.out.println("用户名：");
            String username = sc.nextLine();
            ps.println(username);

            //发送密码
            System.out.println("密码：");
            String password = sc.nextLine();
            ps.println(password);

            System.out.println("注册成功");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
