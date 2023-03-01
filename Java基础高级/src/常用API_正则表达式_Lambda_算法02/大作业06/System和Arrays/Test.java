package 常用API_正则表达式_Lambda_算法02.大作业06.System和Arrays;

/*
我们在逛淘宝的时候,搜索商品之后都可以按照价格从低到高显示,后面淘宝可能会出现新的商品,
那么新添的商品也会按照价格从低到高重新排序,请设计一个程序,完成添加新商品之后价格重新排序.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Goods[] goods = new Goods[3];

        //添加商品信息到数组
        goods[0] = new Goods(200, "耳机");
        goods[1] = new Goods(59, "菜刀");
        goods[2] = new Goods(1000, "雕塑");
        System.out.println(Arrays.toString(goods));
        Arrays.sort(goods, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));
        System.out.println(Arrays.toString(goods));
        System.out.println();

        Goods[] goods1 = new Goods[4];
        goods1[0] = new Goods(120, "零食");

        System.arraycopy(goods, 0, goods1, 1, 3);
        System.out.println(Arrays.toString(goods1));
        Arrays.sort(goods1, Comparator.comparingDouble(Goods::getPrice));
        System.out.println(Arrays.toString(goods1));


    }
}
