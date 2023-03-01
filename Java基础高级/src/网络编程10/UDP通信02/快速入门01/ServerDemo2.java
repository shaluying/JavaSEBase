package 网络编程10.UDP通信02.快速入门01;

/*
服务端
 */

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("=====服务端启动======");

        // 1、创建接收端对象：注册端口（人）
        DatagramSocket socket = new DatagramSocket(8888);

        // 2、创建一个数据包对象接收数据（韭菜盘子）
        byte[] buffer = new byte[1024 * 64];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        // 3、等待接收数据。
        socket.receive(packet);

        // 4、取出数据即可
        System.out.println(packet);

        System.out.println("对方ip地址：" + packet.getAddress());
        System.out.println("对方端口：" + packet.getPort());
        System.out.println("对方ip地址和端口：" + packet.getSocketAddress());

        // 读取多少倒出多少
        int len = packet.getLength();
        String str = new String(buffer, 0, len);
        System.out.println(str);


    }
}
