package 面向对象中.根父类Object07.Object的toString方法02;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private int score;

    public Student() {
        super();//这句话可以省略，但是就算省略，它也存在
        //这句代码，在这里就是调用Object的无参构造
    }

    public Student(String name) {
        super();//这句话可以省略，但是就算省略，它也存在
        //这句代码，在这里就是调用Object的无参构造
        this.name = name;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    //这是Ctrl + o 快捷键重写的toString方法
/*    @Override
    public String toString() {
        return super.toString();
    } 和没有重写没有区别
*/
    //这是Alt + Insert快捷键重写的toString方法
    //这个类似于我们之前写的getInfo()方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
