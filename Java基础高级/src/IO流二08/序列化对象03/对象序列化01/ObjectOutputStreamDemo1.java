package IO流二08.序列化对象03.对象序列化01;

import java.io.*;

/*
 目标：学会对象序列化，使用 ObjectOutputStream 把内存中的对象存入到磁盘文件中。

 transient修饰的成员变量不参与序列化了
 对象如果要序列化，必须实现Serializable序列化接口。

 申明序列化的版本号码
 序列化的版本号与反序列化的版本号必须一致才不会出错！
 private static final long serialVersionUID = 1;
 */

public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        // 1、创建学生对象
        Student student = new Student("张三", "zhangsan", "123466", 35);

        // 2、对象序列化：使用对象字节输出流包装字节输出流管道(只能包字节管道不能包字符管道)
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java基础高级\\src\\IO流二08\\序列化对象03\\.data01.txt"));

        // 3、直接调用序列化方法
        oos.writeObject(student);

        // 4、释放资源
        oos.close();
        System.out.println("序列化完成了~~");

    }
}
