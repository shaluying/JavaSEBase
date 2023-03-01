package 网络编程10.UDP通信02.广播组播03.组播;

/*
客户端
UDP的三种通信方式
单播：单台主机与单台主机之间的通信。
广播：当前主机与所在网络中的所有主机通信。
组播：当前主机与选定的一组主机的通信。

UDP如何实现广播
使用广播地址：255.255.255.255
具体操作：
发送端发送的数据包的目的地写的是广播地址、且指定端口。 （255.255.255.255,xxxx）
本机所在网段的其他主机的程序只要注册对应端口就可以收到消息了。（xxxx）

UDP如何实现组播
使用组播地址：224.0.0.0 ~ 239.255.255.255
具体操作：
发送端的数据包的目的地是组播IP  (例如：224.0.1.1,  端口：xxxx)
接收端必须绑定该组播IP(224.0.1.1)，端口还要注册发送端的目的端口xxxx ，这样即可接收该组播消息。
DatagramSocket的子类MulticastSocket可以在接收端绑定组播IP。

 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientDemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====客户端启动======");

        // 1、创建发送端对象：发送端自带默认的端口号（人）
        DatagramSocket socket = new DatagramSocket();

        /*
         2、创建一个数据包对象封装数据（韭菜盘子）
         public DatagramPacket(byte buf[], int length,
         InetAddress address, int port)
         参数一：封装要发送的数据（韭菜）
         参数二：发送数据的大小
         参数三：服务端的主机IP地址
         参数四：服务端的端口
         */

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("请说：");
            String ms = sc.nextLine();

            if ("exit".equals(ms)) {
                System.out.println("离线成功");
                socket.close();
            }

            byte[] buffer = ms.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, InetAddress.getByName("224.0.100.1"), 6666);

            // 3、发送数据出去
            socket.send(packet);
        }


    }
}
