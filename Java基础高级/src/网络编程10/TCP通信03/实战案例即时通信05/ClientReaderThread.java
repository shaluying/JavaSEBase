package 网络编程10.TCP通信03.实战案例即时通信05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReaderThread extends Thread {
    private Socket socket;

    public ClientReaderThread() {

    }

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //5 接收消息
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;

            while (true) {
                if ((line = br.readLine()) != null) {
                    System.out.println(line);
                } else {
                    break;
                }
            }
        } catch (IOException e) {
//            System.out.println("下线成功");
        }
    }
}
