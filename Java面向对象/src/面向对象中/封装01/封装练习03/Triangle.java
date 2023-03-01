package 面向对象中.封装01.封装练习03;

/*定义三角形类Triangle，
- 声明实例变量a,b,c，代表三角形三条边，全部私有化private，
- 提供每条边的get方法，
- 提供public void setBases(double a, double b, double c)：要求参数a,b,c的值必须大于等于0，且满足三角形三边关系要求（即任意两边之后大于第三边），否则提示错误信息
- 声明public double area()，返回三角形面积
- 声明public double perimeter()：返回三角形周长
- 声明public String getInfo()：返回三角形的三条边，面积和周长
*/
public class Triangle {
    private double a;
    private double b;
    private double c;

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setBases(double a, double b, double c) {
        if (a >= 0 && b >= 0 && c >= 0 && a + b > c && a + c > b && b + c > a) {
            this.a = a;
            this.b = b;
            this.c = c;
            return;
        }
        System.out.println("三角形三条边数值有误！");
    }

    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public String getInfo() {
        return "a边：" + a + " b边:" + b + " c边：" + c + " 面积：" + area() + " 周长：" + perimeter();
    }

}
