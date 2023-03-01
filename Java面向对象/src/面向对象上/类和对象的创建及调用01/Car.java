package 面向对象上.类和对象的创建及调用01;

public class Car {
    // 属性（成员变量）
    String name;
    double price;

    // 方法（成员行为）
    public void start() {
        System.out.println(name + "启动了");
    }

    public void run() {
        System.out.println("价格为" + price + "的汽车跑的很快！");
    }
}
