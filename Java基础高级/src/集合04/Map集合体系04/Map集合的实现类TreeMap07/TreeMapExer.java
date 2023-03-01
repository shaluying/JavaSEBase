package 集合04.Map集合体系04.Map集合的实现类TreeMap07;

/*
需求：字符串“aababcabcdabcde”
          请统计字符串中每一个字符出现的次数，并按照以下格式输出
           输出结果：
                    a（5）b（4）c（3）d（2）e（1）
 */

import com.sun.source.tree.Tree;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapExer {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";

        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        map.forEach((character, integer) -> System.out.print(character + "(" + integer + ")"));


    }
}
