package 面向对象下.枚举02.枚举练习03.设备状态枚举类;

/*
声明设备状态枚举类Status
- 声明final修饰的String类型的属性description和int类型的属性value，value值初始化为ordinal()值
- 声明有参构造Status(String description)
- 重写toString方法，返回description值
- 提供静态方法public static Status getByValue(int value)：根据value值获取Status状态对象
- 创建3个常量对象：
 */

public enum Status {
    FREE("空闲"),
    USED("在用"),
    SCRAP("报废");

    public static Status getByValue(int value) {
        switch (value) {
            case 0:
                return FREE;
            case 1:
                return USED;
            default:
                return SCRAP;
        }
    }

    private final String description;
//    private final int value = ordinal();

    Status(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }
}
