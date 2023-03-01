package 集合04.Map集合体系04.Map案例统计各景点学生数量04;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,
每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
 */

public class MapTest {
    public static void main(String[] args) {
        String[] scenicSpot = {"A", "B", "C", "D"};

        Map<String, Integer> amountMaps = new HashMap<>();

        int a = 0, b = 0, c = 0, d = 0;
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int slect = r.nextInt(4);
            switch (slect) {
                case 0:
                    a++;
                    amountMaps.put("A", a);
                    break;
                case 1:
                    b++;
                    amountMaps.put("B", b);
                    break;
                case 2:
                    amountMaps.put("C", c);
                    c++;
                    break;
                default:
                    amountMaps.put("D", d);
                    d++;
                    break;
            }
        }
        System.out.println(amountMaps);
        System.out.println();

        amountMaps.forEach((k, v) -> System.out.println(k + "景点：" + v));

    }
}
