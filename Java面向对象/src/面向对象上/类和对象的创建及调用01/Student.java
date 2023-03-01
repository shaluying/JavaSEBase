package 面向对象上.类和对象的创建及调用01;

public class Student {
    // 属性
    String name;
    int age;

    // 行为方法
    public void study() {
        System.out.println(name + "年龄" + age + "开始学习");
    }

    public void rest() {
        System.out.println(name + "年龄" + age + "开始休息");
    }
}
