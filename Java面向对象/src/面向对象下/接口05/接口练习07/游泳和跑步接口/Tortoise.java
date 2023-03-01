package 面向对象下.接口05.接口练习07.游泳和跑步接口;

/*
声明乌龟类，
实现Runner接口，重写run()，实现为“乌龟跑的快”
实现Swimming接口，重写swim()方法，实现为“乌龟游的快”
 */

public class Tortoise implements Runner, Swimming {
    @Override
    public void run() {
        System.out.println("乌龟跑的快");
    }

    @Override
    public void swim() {
        System.out.println("乌龟游的快");
    }
}
