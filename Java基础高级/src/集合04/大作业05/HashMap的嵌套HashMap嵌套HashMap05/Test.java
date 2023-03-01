package 集合04.大作业05.HashMap的嵌套HashMap嵌套HashMap05;

/*
某学校Java学科分为基础班和就业班:
Java基础班:
  001	李晨
  002	范冰冰
Java就业班:
  001	马云
  002	马化腾
使用HashMap嵌套HashMap方式完成存储数据,并遍历出所有的学生
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        Map<String, Map<String, String>> classis = new HashMap<>();

        Map<String, String> info = new HashMap<>();
        info.put("001", "李晨");
        info.put("002", "李晨");
        Map<String, String> info2 = new HashMap<>();
        info2.put("001", "马云");
        info2.put("002", "马化腾");

        classis.put("Java基础班", info);
        classis.put("Java就业班", info2);
        System.out.println(classis);

        classis.forEach((String s, Map<String, String> stringStringMap) -> {
            System.out.println(s);
            stringStringMap.forEach((k, v) -> System.out.println("  " + k + "  " + v));
        });


    }
}
