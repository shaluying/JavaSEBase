package File类IO流07.IO流02.字节流的使用02.文件拷贝03.拷贝完后资源释放的方式02;

import java.io.*;

/*
 *   目标：学会使用JDK 7的新方式释放资源
 */
public class TryCatchResouceDemo2 {
    public static void main(String[] args) {

        try (
                // 这里面只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                // 1、创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out04.txt");
                // 2、创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out05.txt");

                // int age = 23; // 这里只能放资源
                MyConnection connection = new MyConnection(); // 最终会自动调用资源的close方法
        ) {

            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class MyConnection implements AutoCloseable { // 实现了此接口
    @Override
    public void close() throws IOException {
        System.out.println("连接资源被成功释放了！");
    }
}