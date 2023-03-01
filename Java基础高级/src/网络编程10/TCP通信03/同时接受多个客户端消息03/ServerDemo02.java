package 网络编程10.TCP通信03.同时接受多个客户端消息03;

/*
服务端

TCP通信服务端用的代表类？
ServerSocket类,注册端口。
调用accept()方法阻塞等待接收客户端连接。得到Socket对象。

TCP通信的基本原理？
客户端怎么发，服务端就应该怎么收。
客户端如果没有消息，服务端会进入阻塞等待。
Socket一方关闭或者出现异常、对方Socket也会失效或者出错。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo02 {
    public static void main(String[] args) throws IOException {
        System.out.println("===服务端启动成功===");

        // 1、注册端口
        ServerSocket serverSocket = new ServerSocket(6359);

        // a.定义一个死循环由主线程负责不断的接收客户端的Socket管道连接。
        while (true) {
            // 2、每接收到一个客户端的Socket管道，交给一个独立的子线程负责读取消息
            Socket socket = serverSocket.accept();
            System.out.println(socket.getRemoteSocketAddress()+"上线了");
            // 3、开始创建独立线程处理socket
            new ServerReaderThread(socket).start();
        }
    }
}
