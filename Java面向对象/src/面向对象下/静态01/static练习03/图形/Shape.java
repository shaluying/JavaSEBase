package 面向对象下.静态01.static练习03.图形;

/*声明一个图形父类Shape，包含
- public double area()：返回0.0
- public double perimeter()：返回0.0
- public String toString()：返回“面积：xxx，周长：xxx”
*/

public class Shape {
    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "面积：" + area() + "，周长：" + perimeter();
    }

}
