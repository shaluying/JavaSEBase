package 集合04.Map集合体系04.Map集合体系遍历方式03.遍历方式03_lambda表达式;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
    目标：Map集合的遍历方式。

    Map集合的遍历方式有：3种。
        （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
        （2）“键值对”的方式遍历：难度较大。
        （3）JDK 1.8开始之后的新技术：Lambda表达式。

    c.JDK 1.8开始之后的新技术：Lambda表达式。
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> maps = new HashMap<>();//无序 不重复 无索引

        maps.put("苹果", 100);
        maps.put("苹果手机", 10000);
        maps.put("外星人电脑", 20030);
        maps.put("迈巴赫", 7030000);
        maps.put("青菜", 20);
        System.out.println(maps);
        System.out.println();

        maps.forEach(new BiConsumer<String, Integer>() { // 匿名内部类
            @Override //此方法用以接收forEach方法底层已经遍历到的键和值 用以后续操作
            public void accept(String key, Integer value) {
                //做了打印操作 （当然也可以做其他操作）
                System.out.println(key + "=" + value);
            }
        });

//        maps.forEach((k, v) -> {
//            System.out.println(k + "=" + v);
//        });

        maps.forEach((k, v) -> System.out.println(k + "=" + v));


    }
}
