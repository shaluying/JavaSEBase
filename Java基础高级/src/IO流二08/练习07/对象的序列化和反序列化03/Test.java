package IO流二08.练习07.对象的序列化和反序列化03;

/*
前面学习时,为了保存单个或者多个数据,可以把数据存储在变量,对象,数组,集合中.
但是这些东西都是存储在内存中,程序运行结束,数据从内存中消失,
为了永久性保存数据,可以使用IO技术把数据保存到文件中,
但是如果是复杂对象,则需要使用序列化和反序列化操作把复杂对象写出到文件,
或者从文件读取复杂对象

需求
黑马程序员学校的3个java班级参加考试,需要把成绩以班级为单位永久保存起来.
 */

import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Map<String, List<Student>> classis = new LinkedHashMap<>();

        List<Student> listOne = new ArrayList<>();
        List<Student> listTwo = new ArrayList<>();
        List<Student> listThree = new ArrayList<>();

        Collections.addAll(listOne, new Student("张三", 23, 86), new Student("李四", 23, 78), new Student("王五", 26, 89));
        Collections.addAll(listTwo, new Student("孟凡", 20, 82), new Student("赵玲", 22, 95), new Student("刘云", 23, 99));
        Collections.addAll(listThree, new Student("齐国", 25, 74), new Student("林旭", 26, 78), new Student("朱伟", 24, 68));

        classis.put("Java一班", listOne);
        classis.put("Java二班", listTwo);
        classis.put("Java三班", listThree);
        System.out.println(classis);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Java基础高级\\src\\IO流二08\\练习07\\对象的序列化和反序列化03\\classInfo.txt"));
        oos.writeObject(classis);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Java基础高级\\src\\IO流二08\\练习07\\对象的序列化和反序列化03\\classInfo.txt"));

        Map<String, List<Student>> classisInfo = (Map<String, List<Student>>) ois.readObject();

        classisInfo.forEach((k, v) -> {
            System.out.println(k + "信息如下：");
            for (Student student : v) {
                System.out.println(student);
            }
        });


    }
}
