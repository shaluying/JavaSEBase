package 面向对象中.多态03.向上转型与向下转型05;

public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("细嚼慢咽吃饭");
    }

    @Override
    public void walk() {
        System.out.println("婀娜多姿走路");
    }

    public void makeUp(){
        System.out.println("画的美美的");
    }
}
