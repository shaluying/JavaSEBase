package 面向对象下.枚举02.枚举练习03.颜色枚举类;

/*
声明颜色枚举类Color：
- 声明final修饰的int类型的属性red,green,blue
- 声明final修饰的String类型的属性description
- 声明有参构造Color(int red, int green, int blue,String description)
- 创建7个常量对象：赤、橙、黄、绿、青、蓝、紫，
- 重写toString方法，例如：RED(255,0,0)->红色
 */

public enum Color {
    RED(255, 0, 0, "红色"),
    ORANGE(255, 128, 0, "橙色"),
    YELLOW(255, 255, 0, "黄色"),
    GREEN(0, 255, 0, "绿色"),
    MALACHITE(0, 255, 255, "青色"),
    BLUE(0, 0, 255, "蓝色"),
    PURPLE(128, 0, 255, "紫色");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }


    @Override
    public String toString() {
        return name() + "(" + red + "," + green + "," + blue + ")" + "->" + description;
    }
}
