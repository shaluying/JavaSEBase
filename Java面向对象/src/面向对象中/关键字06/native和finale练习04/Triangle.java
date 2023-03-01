package 面向对象中.关键字06.native和finale练习04;

/*声明三角形类Triangle
属性：double类型的a,b,c，代表三角形的三条边，要求属性使用final声明，并且私有化

提供有参构造，并且在构造器中检查a,b,c是否可以构成三角形，如果a,b,c可以构成三角形则正常赋值，否则提示错误，并且a,b,c赋值为0

生成a,b,c的get方法

重写toString方法，并返回三角形信息，例如：“三角形三边是：3.0,4.0,5.0，面积是6.0，周长是：12.0”

重写hashCode和equals方法
*/

public class Triangle {
    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            System.out.println("三条边输入值有误！");
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
