package 面向对象中.多态03.多态参数和返回值03;

import 面向对象中.多态03.多态数组02.*;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Circle c1 = new Circle();

        r1.setLength(10);
        r1.setWidth(5);
        c1.setRadius(8);

        GraphicTools gt = new GraphicTools();
        Graphic max = gt.maxArea(r1, c1);
        /*
        形参是(Graphic g1, Graphic g2)
        实参是Rectangle的r1和Circle的r2，
        这个也是多态引用
         */
        /*
        max是Graphic类型，实际存储的是Rectangle或Circle类型的对象
         */
        System.out.println(max.getInfo());// 调父执行子

    }
}
