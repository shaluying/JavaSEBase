package 面向对象上.综合项目购物车;

public class Article {
    int id;
    String name;
    double price;
    int buyNumber;

    public void printSelfInfo() {
        System.out.println("商品ID:" + id + " 商品名称:" + name + " 商品价格:" + price + " 购买数量:" + buyNumber);
    }

}
