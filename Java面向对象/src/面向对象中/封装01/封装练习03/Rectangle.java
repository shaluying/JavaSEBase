package 面向对象中.封装01.封装练习03;

/*定义矩形类Rectangle，

- 声明实例变量长和宽，全部私有化private，
- 提供相应的get/set方法，如果set方法的参数值<=0，则提示矩形的长和宽必须是正数
- 声明public double area()，返回矩形面积
- 声明public double perimeter()：返回矩形的周长
- 声明public String getInfo()：返回矩形的长、宽、面积、周长信息
*/
public class Rectangle {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length <= 0) {
            System.out.println("set错误：值必须为正数！");
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (length <= 0) {
            System.out.println("set错误：值必须为正数！");
            return;
        }
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    public String getInfo() {
        return "矩形的长：" + length + "\t宽：" + width + "\t面积：" + area() + "\t周长：" + perimeter();
    }



}
