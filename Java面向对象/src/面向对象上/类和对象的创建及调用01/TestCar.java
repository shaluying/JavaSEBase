package 面向对象上.类和对象的创建及调用01;

public class TestCar {
    public static void main(String[] args) {
        // 创建汽车对象
        Car c = new Car();

        // 给创建的汽车对象属性赋值
        c.name = "迈巴赫";
        c.price = 2000000;

        // 调用汽车对象的方法
        c.start();
        c.run();
    }
}
