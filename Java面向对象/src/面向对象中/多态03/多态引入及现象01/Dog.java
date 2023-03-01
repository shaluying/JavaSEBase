package 面向对象中.多态03.多态引入及现象01;

public class Dog extends Pet {

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void watchHouse() {
        System.out.println("看家");
    }
}
