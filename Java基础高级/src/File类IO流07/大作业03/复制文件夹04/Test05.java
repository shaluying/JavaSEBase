package File类IO流07.大作业03.复制文件夹04;

import java.io.*;

/*
    第五题
        windows操作系统中可以复制文件夹,比如把D:\\from\\day11文件夹,复制到E:\\to\\day11文件夹下。
        但是java没有提供直接复制文件夹的方法。
        请编写程序从键盘接收两个文件夹路径,把其中一个文件夹中(包含内容)拷贝到另一个文件夹中。

    实现步骤：
        1、定义复制文件到文件夹的方法copyFile2Dir
            1.1、创建文件字节输入流FileInputStream类的对象,绑定源文件
            1.2、定义byte数组,保存每次读取到的字节的内容
            1.3、定义int变量,保存每次读取到的字节数量
            1.4、根据目标文件夹和源文件,创建目标文件
            1.5、创建文件字节输出流FileOutputStream类的对象,绑定目标文件
            1.6、循环读(源文件)写(目标文件)
            1.7、关闭流释放资源
        2、定义复制文件夹到文件夹的方法copyDir2Dir
            2.1、在目标文件夹中创建源文件夹
            2.2、获取源文件夹中的所有的文件和文件夹对应的File对象数组
            2.3、判断,如果File对象数组是null或者没有内容,结束方法
            2.4、遍历File对象数组
            2.5、判断,如果当前File对象是文件,调用copyFile2Dir方法,完成文件复制
            2.6、判断,如果当前File对象是文件夹,递归调用copyDir2Dir方法,完成文件夹复制
      3、创建File对象srcDir,代表源文件夹
      4、创建File对象destDir,代表目标文件夹(把源文件夹拷贝到目标文件夹中)
      5、调用copyDir2Dir方法,传递源文件夹和目标文件夹,完成文件夹的复制
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        //3、创建File对象srcDir,代表源文件夹
        File srcDir = new File("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）\\基础加强阶段练习题参考（参考练习，偏难，可做上课案例，可不做此练习）\\IO1_作业\\04_图解");

        //4、创建File对象destDir,代表目标文件夹(把源文件夹拷贝到目标文件夹中)
        File destDir = new File("E:\\My video\\Java\\黑马程序员\\一.入门\\01-JavaSE基础\\资料\\4、课程练习题参考（可不做）\\基础加强阶段练习题参考（参考练习，偏难，可做上课案例，可不做此练习）\\IO1_作业\\新建文件夹");

        //5、调用copyDir2Dir方法,传递源文件夹和目标文件夹,完成文件夹的复制
        copyDir2Dir(srcDir,destDir);
    }
    //1、定义复制文件到文件夹的方法copyFile2Dir
    public static void copyFile2Dir(File file,File destDir) throws IOException {
        //1.1、创建文件字节输入流FileInputStream类的对象,绑定源文件
        InputStream is = new FileInputStream(file);

        //1.2、定义byte数组,保存每次读取到的字节的内容
        byte[] bs = new byte[1024];

        //1.3、定义int变量,保存每次读取到的字节数量
        int len = 0;

        //1.4、根据目标文件夹和源文件,创建目标文件
        File destFile = new File(destDir,file.getName());

        //1.5、创建文件字节输出流FileOutputStream类的对象,绑定目标文件
        OutputStream os = new FileOutputStream(destFile);

        //1.6、循环读(源文件)写(目标文件)
        while ((len = is.read(bs)) != -1) {
            os.write(bs,0,len);
        }

        //1.7、关闭流释放资源
        os.close();
        is.close();
    }

    //2、定义复制文件夹到文件夹的方法copyDir2Dir
    public static void copyDir2Dir(File srcDir, File destDir) throws IOException {
        //2.1、在目标文件夹中创建源文件夹
        File newDestDir = new File(destDir, srcDir.getName());
        if (!newDestDir.exists()) {
            newDestDir.mkdirs();
        }
        //2.2、获取源文件夹中的所有的文件和文件夹对应的File对象数组
        File[] files = srcDir.listFiles();

        //2.3、判断,如果File对象数组是null或者没有内容,结束方法
        if (files == null || files.length == 0) {
            return;
        }

        //2.4、遍历File对象数组
        for (File file : files) {
            //2.5、判断,如果当前File对象是文件,调用copyFile2Dir方法,完成文件复制
            if (file.isFile()) {
                copyFile2Dir(file,newDestDir);
            }
            //2.6、判断,如果当前File对象是文件夹,递归调用copyDir2Dir方法,完成文件夹复制
            if (file.isDirectory()) {
                copyDir2Dir(file,newDestDir);
            }

        }

    }
}
