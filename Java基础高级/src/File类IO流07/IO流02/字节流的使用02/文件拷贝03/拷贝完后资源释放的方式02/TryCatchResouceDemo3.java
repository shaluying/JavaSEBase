package File类IO流07.IO流02.字节流的使用02.文件拷贝03.拷贝完后资源释放的方式02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/*
 *   目标：JDK 9释放资源的方式：可以了解下。
 */
public class TryCatchResouceDemo3 {
    public static void main(String[] args) throws Exception {

        // 1、创建一个字节输入流管道与原视频接通
        InputStream is = new FileInputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out04.txt");
        // 2、创建一个字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out05.txt");
        try (is; os) {
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
