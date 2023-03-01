package 面向对象下.接口05.接口练习07.游泳和跑步接口;

//测试类中创建兔子和乌龟类的对象，并调用相应方法

public class Test {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();

        rabbit.run();
        System.out.println();
        tortoise.run();
        tortoise.swim();


    }
}
