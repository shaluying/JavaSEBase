package File类IO流07.IO流02.字节流的使用02.文件拷贝03.拷贝完后资源释放的方式02;

import java.io.*;

/*
 *   目标：学会使用finally释放资源。
 */

public class TryCatchResouceDemo1 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;

        try {

//            System.out.println(10/0); //执行此语句会导致 is 和 os 为null
            // 后面释放资源的时候回空指针异常 所以需要加判断避免出现异常导致性能下降

            // 1、创建一个字节输入流管道与文件接通
            is = new FileInputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out04.txt");

            // 2、创建一个字节输出流管道与目标文件接通
            os = new FileOutputStream("Java基础高级\\src\\File类IO流07\\IO流02\\out05.txt");

            // 3、定义一个字节数组转移数据
            byte[] bytes = new byte[1024]; //1024B -> 1KB
            int len;// 记录每次读取的字节数
            while ((len = is.read(bytes)) != -1) {
                os.write(bytes, 0, len);
            }

            System.out.println("拷贝完成！");

//            System.out.println(10/0); // 此语句执行会导致执行catch里面的语句
            // 下面的释放资源就执行不了了，所以在finally里面写释放资源语句


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里
            System.out.println("========finally=========");
            try {
                if (os != null) os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
