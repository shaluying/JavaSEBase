package 网络编程10.大作业04.电商登录01;

import java.io.*;
import java.net.Socket;
import java.util.Properties;

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
            //判断客户端发送的是注册指令还是登录指令
            String mes;
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            mes = br.readLine();
            if ("register".equals(mes)) {//注册
                register(br);


            } else if ("login".equals(mes)) {//登录
                login(br);

            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void login(BufferedReader br) {
        try {
            //加载文件信息到properties集合中
            Properties properties = new Properties();
            properties.load(new FileReader("Java基础高级\\src\\网络编程10\\大作业04\\电商登录01\\user.properties"));

            String username, password;
            username = br.readLine();
            password = br.readLine();
            PrintStream ps = new PrintStream(socket.getOutputStream());
            if (properties.containsKey(username)) {
                if (properties.getProperty(username).equals(password)) {
                   ps.println("登录成功");
                } else {
                    ps.println("密码错误");
                }
            } else {
                ps.println("用户名错误");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void register(BufferedReader br) {
        try {
            String username, password;

            if ((username = br.readLine()) != null) {
                Server.userProperties.setProperty(username, "");
            }
            if ((password = br.readLine()) != null) {
                Server.userProperties.setProperty(username, password);
            }

            //加载注册信息到服务端本地保存
            Server.userProperties.store(new FileWriter("Java基础高级\\src\\网络编程10\\大作业04\\电商登录01\\user.properties"), "Users Info");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }


}
