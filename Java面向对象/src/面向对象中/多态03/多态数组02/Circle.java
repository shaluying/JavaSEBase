package 面向对象中.多态03.多态数组02;

/*
Circle：圆
 */
public class Circle extends Graphic {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String getInfo() {
        return "半径：" + radius +"，" + super.getInfo();
    }
}
