package day0121_11teacher_code.com.atguigu.init;

public class TestSon {
    public static void main(String[] args) {
        Son s1 = new Son();
        System.out.println(s1.getInfo());

        System.out.println("---------------");
        Son s2 = new Son(10,10,10);
        System.out.println(s2.getInfo());
    }
}
