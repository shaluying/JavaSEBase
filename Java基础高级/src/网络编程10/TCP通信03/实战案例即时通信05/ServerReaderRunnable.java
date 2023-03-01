package 网络编程10.TCP通信03.实战案例即时通信05;

import java.io.*;
import java.net.Socket;

public class ServerReaderRunnable implements Runnable {
    private Socket socket;

    public ServerReaderRunnable() {
    }

    public ServerReaderRunnable(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            // 3、从socket通信管道中得到一个字节输入流
            InputStream is = socket.getInputStream();

            // 4、把字节输入流包装成缓冲字符输入流进行消息的接收
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            // 5、按照行读取消息
            String line;
            while (true) {
                if ((line = br.readLine()) != null && !"exit".equals(line)) {
                    System.out.println(socket.getRemoteSocketAddress() + "说：" + line);
                    sendMsgToAll(line);
                } else {
                    System.out.println(socket.getRemoteSocketAddress() + "下线了");
                    ServerDemo02.onLineSockets.remove(socket);
                    sendMsgToAll(socket.getRemoteSocketAddress() + "下线了");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(socket.getRemoteSocketAddress() + "下线了");
            ServerDemo02.onLineSockets.remove(socket);
            try {
                sendMsgToAll(socket.getRemoteSocketAddress() + "下线了");
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        }
    }

    private void sendMsgToAll(String line) throws IOException {
        for (Socket socket : ServerDemo02.onLineSockets) {
            PrintStream ps = new PrintStream(socket.getOutputStream());
            ps.println(line);
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
