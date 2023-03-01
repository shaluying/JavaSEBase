package 面向对象中.代码块05.实例初始化过程本质init方法02;

public class TestFather {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.getInfo());
        System.out.println("-----------------------");
        Father f2 = new Father(10,10);
        System.out.println(f2.getInfo());
    }
}
