package 不可变集合_Stream_异常05.不可变集合01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
  目标：不可变集合。

  不可变集合，就是不可被修改的集合。
集合的数据项在创建的时候提供，并且在整个生命周期中都不可改变。否则报错。

在List、Set、Map接口中，都存在of方法，可以创建一个不可变的集合。
 */
public class CollectionDemo {
    public static void main(String[] args) {
        // 1、不可变的List集合
        List<Double> lists = List.of(569.5, 700.5, 523.0, 570.5);
        // lists.add(689.0);
        // lists.set(2, 698.5);
        // System.out.println(lists);
        double score = lists.get(1);
        System.out.println(score);

        // 2、不可变的Set集合
        Set<String> names = Set.of("迪丽热巴", "迪丽热九", "马尔扎哈", "卡尔眨巴");
        // names.add("三少爷");
        System.out.println(names);

        // 3、不可变的Map集合
        Map<String, Integer> maps = Map.of("huawei", 2, "Java开发", 1, "手表", 1);
        // maps.put("衣服", 3);
        System.out.println(maps);
    }
}
