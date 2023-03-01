package 网络编程10.TCP通信03.多发多收消息02;

/*
客户端

TCP通信的客户端的代表类是谁？
Socket类
public Socket(String host , int port)

TCP通信如何使用Socket管道发送、接收数据。
OutputStream getOutputStream()：获得字节输出流对象（发）
InputStream getInputStream()：获得字节输入流对象（收）
 */

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo01 {
    public static void main(String[] args) throws IOException {
        System.out.println("====客户端启动===");

        // 1、创建Socket通信管道请求有服务端的连接
        // public Socket(String host, int port)
        // 参数一：服务端的IP地址
        // 参数二：服务端的端口
        Socket socket = new Socket("169.254.142.0", 6359);

        // 2、从socket通信管道中得到一个字节输出流 负责发送数据
        OutputStream os = socket.getOutputStream();
        // 3、把低级的字节流包装成打印流
        PrintStream ps = new PrintStream(os);

        // 4、发送消息
        Scanner sc= new Scanner(System.in);
        while (true) {
            System.out.println("请说：");
            String mes = sc.nextLine();

            if ("exit".equals(mes)){
                System.out.println("离线成功");
                socket.close();
                break;
            }

            ps.println(mes);
            ps.flush();
        }

        // 关闭资源。
        // socket.close();

    }
}
