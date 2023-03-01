package 面向对象中.封装01.封装练习03;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        t.setBases(8, 9, 15);
        System.out.println(t.perimeter());
        System.out.println(t.area());
        System.out.println(t.getInfo());
    }
}
