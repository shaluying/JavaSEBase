package 面向对象上.类和对象的创建及调用01;

public class 类和对象的注意事项 {
    public static void main(String[] args) {
        // 一个.Java文件中可以定义多个class类 但只能一个类是public修饰
        // 而且public修饰的类的名字必须是代码文件名
        // 建议一个.Java文件一个类 便于维护

        // 成员变量的完整格式 修饰符 数据类型 变量名称 = 初始化值
        // 一般无需指定初始化值，因为存在默认值

        // 修饰符 数据类型 变量名称 = 初始化值;
    }
}

class Animal {

}

class Cat {
    public String name = "老虎";
    public double weight = 300;

}