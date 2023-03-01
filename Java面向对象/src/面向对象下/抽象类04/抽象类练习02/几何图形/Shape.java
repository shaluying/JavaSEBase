package 面向对象下.抽象类04.抽象类练习02.几何图形;

/*
声明一个抽象图形父类Shape，包含
- public abstract double area()
- public abstract double perimeter()
- public String toString()：返回“面积：xxx，周长：xxx”
 */

public abstract class Shape {
    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "面积：" + area() + "，周长：" + perimeter();
    }
}
