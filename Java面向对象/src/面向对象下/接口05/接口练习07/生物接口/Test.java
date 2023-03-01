package 面向对象下.接口05.接口练习07.生物接口;

/*
在测试类中，分别创建两个实现类的对象，调用对应的方法。通过接口名调用静态方法
 */

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Plant plant = new Plant();

        animal.breathe();
        animal.eat();
        animal.sleep();
        System.out.println();
        plant.breathe();
        plant.eat();
        System.out.println();
        LiveAble.drink();


    }
}
