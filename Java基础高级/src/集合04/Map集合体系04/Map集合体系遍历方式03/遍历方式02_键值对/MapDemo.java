package 集合04.Map集合体系04.Map集合体系遍历方式03.遍历方式02_键值对;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    目标：Map集合的遍历方式。

    Map集合的遍历方式有：3种。
        （1）“键找值”的方式遍历：先获取Map集合全部的键，再根据键找值。
        （2）“键值对”的方式遍历：难度较大。
        （3）JDK 1.8开始之后的新技术：Lambda表达式。

    b.“键值对”的方式遍历：
        1.把Map集合转换成一个Set集合:Set<Map.Entry<K, V>> entrySet();
        2.此时键值对元素的类型就确定了，类型是键值对实体类型：Map.Entry<K, V>
        3.接下来就可以用foreach遍历这个Set集合，类型用Map.Entry<K, V>
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

        /*
            maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 娃娃=30}
                👇
            使用foreach遍历map集合.发现Map集合的键值对元素直接是没有类型的。所以不可以直接foreach遍历集合。
                👇
            可以通过调用Map的方法 entrySet把Map集合转换成Set集合形式  maps.entrySet();
                👇
            Set<Map.Entry<String,Integer>> entries =  maps.entrySet();
             [(huawei=1000), (手表=10), (生活用品=10), (iphoneX=100), (娃娃=30)]
                              entry
                👇
            此时可以使用foreach遍历 类型为Map.Entry<String, Integer>
       */

        // 1、把Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        System.out.println(entries);

        // 2、开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
