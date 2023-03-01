package 网络编程10.大作业04.电商登录01;

/*
在京东/淘宝等商城购物时,需要先注册账户,
把用户名和密码保存到京东/淘宝等商城的服务器上.
购物之前必须先登录,
验证用户输入的用户名和密码与京东/淘宝等商城的服务器保存的用户名和密码是否一致,
如果一致登录成功,如果不一致登录失败.

本案例使用TCP协议模拟登录操作(Socket作为客户端,ServerSocket作为服务器端)
,在服务器创建user.properties文件,保存已经注册的用户的用户名和密码(格式:root=toor,左侧root代表用户名,右侧toor代表密码),
客户端通过键盘录入用户名和密码,发送给服务器端进行验证,
验证通过,服务器端给出客户端响应"登录成功"提示信息,
验证失败,服务器端给出客户端响应"登录失败"提示信息.
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Properties;
import java.util.concurrent.*;

public class Server {
    public static Properties userProperties = new Properties();
    private static final ExecutorService pool = new ThreadPoolExecutor(3, 5, 6, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(6),
            Executors.defaultThreadFactory(),
            new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动");

        //注册端口
        ServerSocket serverSocket = new ServerSocket(8848);

        //等待客户端连接
        while (true) {
            //连接客户端成功
            Socket socket = serverSocket.accept();

            //把管道交给线程池处理
            pool.execute(new ServerReaderRunnable(socket));

        }
    }
}
