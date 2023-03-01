package IO流二08.转换流02.字符输入转换流01;

import java.io.*;

/*
 目标：字符输入转换流InputStreamReader的使用。

 字节流                                     字符流
 字节输入流               字节输出流              字符输入流            字符输出流
 InputStream             OutputStream          Reader               Writer   (抽象类)
 FileInputStream         FileOutputStream      FileReader           FileWriter(实现类)
 BufferedInputStream     BufferedOutputStream  BufferedReader       BufferedWriter(实现类，缓冲流)
                                               InputStreamReader    OutputStreamWriter
 字符输入转换流InputStreamReader:
 -- 作用：可以解决字符流读取不同编码乱码的问题。
 也可以把原始的字节流按照指定编码转换成字符输入流

 -- 构造器：
 public InputStreamReader(InputStream is)：可以使用当前代码默认编码转换成字符流，几乎不用！
 public InputStreamReader(InputStream is,String charset):可以指定编码把字节流转换成字符流(核心)

 小结：
 字符输入转换流InputStreamReader:作用：可以解决字符流读取不同编码乱码的问题。
 public InputStreamReader(InputStream is,String charset):可以指定编码把字节流转换成字符流(核心)
 */

public class InputStreamReaderDemo01 {
    public static void main(String[] args) {
        try (
                // 1、提取GBK文件的原始字节输入流。
                //创建 字节输入流 与源文件接通
                InputStream is = new FileInputStream("Java基础高级\\src\\IO流二08\\转换流02\\data01.txt");

                // 2、把原始字节输入流转换成字符输入流
//                Reader isr = new InputStreamReader(is) // 将字节输入流转化为默认编码（UTF-8）的字符输入流
                Reader isr = new InputStreamReader(is, "GBK");// 将字节输入流转化为指定编码的字符输入流
                BufferedReader br = new BufferedReader(isr); // 包装字符输入流为缓冲字符输入流
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
