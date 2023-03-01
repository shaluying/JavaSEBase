package File类IO流07.IO流02.字节流的使用02.文件拷贝03.文件拷贝方式01;

import java.io.*;

/*
 *   目标：学会使用字节流完成文件的复制（支持一切文件类型的复制）
 */

public class CopyDemo {
    public static void main(String[] args) {
        try {
            // 1、创建一个字节输入流管道与文件接通
            InputStream is = new FileInputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out04.txt");

            // 2、创建一个字节输出流管道与目标文件接通
            OutputStream os = new FileOutputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out05.txt");

            // 3、定义一个字节数组转移数据
            byte[] bytes = new byte[1024]; //1024B -> 1KB
            int len;// 记录每次读取的字节数
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }

            System.out.println("拷贝完成！");

            // 4、关闭流。
            os.close();
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
