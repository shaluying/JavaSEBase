package IO流二08.序列化对象03.对象反序列化02;

/*
 目标：学会进行对象反序列化：
 使用对象字节输入流把文件中的对象数据恢复成内存中的Java对象。
 */

import IO流二08.序列化对象03.对象序列化01.Student;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 1、创建对象字节输入流管道包装低级的字节输入流管道
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java基础高级\\src\\IO流二08\\序列化对象03\\.data01.txt"));

        // 2、调用对象字节输入流的反序列化方法
        Student s = (Student) ois.readObject();

        System.out.println(s);
    }

}
