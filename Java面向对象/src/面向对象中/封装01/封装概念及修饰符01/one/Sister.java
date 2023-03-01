package 面向对象中.封装01.封装概念及修饰符01.one;

public class Sister {
    public void method() {
        Father f = new Father();
//        System.out.println(f.a);//不行，因为a是private，只能本类
        System.out.println(f.b);
        System.out.println(f.c);
        System.out.println(f.d);
    }
}
