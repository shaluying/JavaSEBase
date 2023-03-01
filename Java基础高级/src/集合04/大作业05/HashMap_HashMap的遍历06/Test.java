package 集合04.大作业05.HashMap_HashMap的遍历06;

/*
我们在逛淘宝的时候,会把喜欢的商品加入到购物车中,
当我们第一次加入到购物车的时候,购物车中该商品的数量会显示为1,
如果我们添加的是同一个店铺的同一件商品,购物车中该商品的数量会增加1。
但是如果添加的不是同一个店铺的商品不用,我们则认为不是同一件商品,
添加到购物车的时候就会当做新商品添加。
请设计程序,完成将商品添加到购物车的需求.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<Product, Integer> products = new HashMap<>();

        products.put(new Product("良品铺子", "干果"), 5);
        products.put(new Product("三只松鼠", "牛肉干"), 3);

        System.out.println(products);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入店铺名称：");
        String shopName = sc.next();
        System.out.println("请输入商品名称：");
        String goodsName = sc.next();
        Product product = new Product(shopName, goodsName);

        if (products.containsKey(product)) {
            products.put(product, products.get(product) + 1);
        } else {
            products.put(product, 1);
        }


        System.out.println(products);
    }
}
