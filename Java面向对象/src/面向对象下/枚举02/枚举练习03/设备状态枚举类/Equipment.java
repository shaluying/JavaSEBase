package 面向对象下.枚举02.枚举练习03.设备状态枚举类;

/*
声明设备类型Equipment
- 声明设备编号(int)、设备的品牌（String）、价格（double）、设备名称（String）、状态（Status）属性，私有化
- 提供无参和有参构造
- 重写toString方法，返回设备信息
 */

public class Equipment {
    private int id;
    private String brand;
    private double price;
    private String name;
    private Status status;

    public Equipment() {
    }

    public Equipment(int id, String brand, double price, String name, Status status) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.name = name;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
