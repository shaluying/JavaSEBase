package 面向对象中.多态03.多态数组02;

public class Graphic {
    public double area() {//面积
        return 0.0; //这里写0.0的目的是为了编译通过
    }

    public double perimeter() {//周长
        return 0.0;
    }

    public String getInfo() {
        return "面积：" + area() + "，周长：" + perimeter();
    }
}
