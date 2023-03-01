package 面向对象下.静态01.static练习03.图形;

/*声明一个矩形Rectangle，继承Shape父类
- 属性：长和宽，私有化
- 提供get/set
- 提供无参构造和有参构造
- 重写area()和perimeter方法，
- 重写toString方法，返回“长：xx，宽：xx，面积：xxx，周长：xxx”
*/

public class Rectangle extends Shape {
    private double length;
    private double wide;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWide() {
        return wide;
    }

    public void setWide(double wide) {
        this.wide = wide;
    }

    public Rectangle() {
    }

    public Rectangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    @Override
    public double area() {
        return length * wide;
    }

    @Override
    public double perimeter() {
        return 2 * (length + wide);
    }

    @Override
    public String toString() {
        return "长：" + length + "，宽：" + wide + super.toString();
    }
}
