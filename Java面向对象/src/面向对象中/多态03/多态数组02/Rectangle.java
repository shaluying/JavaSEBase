package 面向对象中.多态03.多态数组02;

/*
Rectangle：矩形
*/
public class Rectangle extends Graphic {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String getInfo() {
        return "长：" + length +"，宽：" + width +"," + super.getInfo();
    }
}
