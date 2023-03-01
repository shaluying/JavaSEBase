package 常用API_正则表达式_Lambda_算法02.大作业06.System和Arrays;

/*
我们在逛淘宝的时候,搜索商品之后都可以按照价格从低到高显示,后面淘宝可能会出现新的商品,
那么新添的商品也会按照价格从低到高重新排序,请设计一个程序,完成添加新商品之后价格重新排序.
 */

public class Goods {
    private double price;
    private String name;

    public Goods() {
    }

    public Goods(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
