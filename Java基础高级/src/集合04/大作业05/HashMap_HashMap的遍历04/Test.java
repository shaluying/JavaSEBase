package 集合04.大作业05.HashMap_HashMap的遍历04;

/*
某商店想统计一下一天内所售出的商品以及商品的数量，
请设计程序完成此需求,展示每个售出的商品名称和数量
  要求:通过键盘录入商品名称模拟售出的商品，
  录入一次表示商品售出一次，直到录入end结束,结束之后,将统计结果打印出来
 */

import 集合和泛型03.泛型02.自定义泛型接口04.Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Map<String, Integer> goods = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入商品名称，每行输入一个，一end结束");

        while (true) {
            String goodsName = sc.next();
            if (goodsName.equals("end")) {
                break;
            } else {
                if (goods.containsKey(goodsName)) {
                    goods.put(goodsName, goods.get(goodsName) + 1);
                } else {
                    goods.put(goodsName, 1);
                }
            }
        }

        System.out.println(goods);
        goods.forEach((k,v) -> System.out.println(k+"出售数量："+v));

    }
}
