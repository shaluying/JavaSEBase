package IO流二08.缓冲流01.缓冲流概述及使用01;

import java.io.*;

/*
    目标：使用字节缓冲流完成数据的读写操作。

    缓冲流概述
        缓冲流也称为高效流、或者高级流。之前学习的字节流可以称为原始流。
        作用：缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能

    字节缓冲流性能优化原理：
        字节缓冲输入流自带了8KB缓冲池，以后我们直接从缓冲池读取数据，所以性能较好。
        字节缓冲输出流自带了8KB缓冲池，数据就直接写入到缓冲池中去，写数据性能极高了。

缓冲流的作用？
    缓冲流自带缓冲区、可以提高原始字节流、字符流读写数据的性能
缓冲流有几种？
    字节缓冲流
        字节缓冲输入流： BufferedInputStream
         字节缓冲输出流：BufferedOutputStream
    字符缓冲流
        字符缓冲输入流：BufferedReader
        字符缓冲输出流：BufferedWriter

字节缓冲流为什么提高了操作数据的性能？
    字节缓冲流自带8KB缓冲区
    可以提高原始字节流、字符流读写数据的性能
字节缓冲流的功能如何调用？
    public BufferedOutputStream​(OutputStream os)
    public BufferedInputStream​(InputStream is)
    功能上并无很大变化，性能提升了。

 */
public class ByteBufferDemo {
    public static void main(String[] args) {

        try (
                // 这里面只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                // 1、创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream("D:\\resources\\newmeinv.jpeg");
                // a.把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);
                // 2、创建一个字节输出流管道与目标文件接通
                OutputStream os = new FileOutputStream("D:\\resources\\newmeinv222.jpeg");
                // b.把字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);

        ) {

            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024];
            int len; // 记录每次读取的字节数。
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("复制完成了！");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
