package IO流二08.转换流02.字符输出转换流02;

import java.io.*;

/*
 目标：字符输出转换OutputStreamWriter流的使用。

 字节流                                         字符流
 字节输入流               字节输出流              字符输入流            字符输出流
 InputStream             OutputStream          Reader               Writer   (抽象类)
 FileInputStream         FileOutputStream      FileReader           FileWriter(实现类)
 BufferedInputStream     BufferedOutputStream  BufferedReader       BufferedWriter(实现类，缓冲流)
                                               InputStreamReader    OutputStreamWriter

 字符输出转换流：OutputStreamWriter
 -- 作用：可以指定编码把字节输出流转换成字符输出流。
 可以指定写出去的字符的编码。
 -- 构造器：
 public OutputStreamWriter(OutputStream os) :   用当前默认编码UTF-8把字节输出流转换成字符输出流
 public OutputStreamWriter(OutputStream os , String charset):指定编码把字节输出流转换成字符输出流
 小结：
 字符输出转换流OutputStreamWriter可以指定编码把字节输出流转换成字符输出流。
 从而实现指定写出去的字符编码！
 */

public class OutputStreamReaderDemo02 {
    public static void main(String[] args) throws IOException {
        // 1、定义一个字节输出流
        OutputStream os = new FileOutputStream("Java基础高级\\src\\IO流二08\\转换流02\\data02.txt");

        // 2、把原始的字节输出流转换成字符输出流
        // Writer osw = new OutputStreamWriter(os); // 以默认的UTF-8写字符出去 跟直接写FileWriter一样
        Writer osw = new OutputStreamWriter(os, "GBK");// 指定GBK的方式写字符出去

        // 3、把低级的字符输出流包装成高级的缓冲字符输出流。
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("我爱中国");
        bw.write("我爱中国");
        bw.write("我阿斯顿发生");
        bw.write("的干撒");

        bw.close();

    }
}
