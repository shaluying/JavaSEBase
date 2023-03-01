package 集合和泛型03.大作业03.ArrayList集合_迭代器05;

public class OrderItem {
    private static int total = 1001;
    private int id;
    private String name;
    private double price;

    public OrderItem() {
    }

    public OrderItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = total;
        total++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
