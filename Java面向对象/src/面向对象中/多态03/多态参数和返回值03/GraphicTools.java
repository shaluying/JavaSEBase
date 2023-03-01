package 面向对象中.多态03.多态参数和返回值03;

import 面向对象中.多态03.多态数组02.*;

public class GraphicTools {
    /*
    需求：编写一个方法，可以返回两个图形中，面积更大的那个图形对象
    但是不确定是两个矩形，圆，还是其他的子类对象。

    形参类型设计为父类的对象
     */
    public Graphic maxArea(Graphic g1, Graphic g2) {
        return g1.area() > g2.area() ? g1 : g2;
        // 调父执行子
         /*
          g1和g2的编译时类型是Graphic，运行时类型是Rectangle和Circle的一种
          因为调用时，传入的是1个矩形对象或1个圆对象
         */
    }
}
