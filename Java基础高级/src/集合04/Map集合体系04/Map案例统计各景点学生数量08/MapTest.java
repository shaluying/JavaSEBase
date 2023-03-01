package 集合04.Map集合体系04.Map案例统计各景点学生数量08;

/*
某个班级多名学生，现在需要组成秋游活动，班长提供了四个景点依次是（A、B、C、D）,
每个学生可以选择多个景点，请统计出最终哪个景点想去的人数最多
*/

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        String[] scenicSpot = {"A", "B", "C", "D"};

        Map<String, Integer> amountMaps = new HashMap<>();

        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            int ranCount = r.nextInt(4);
            switch (ranCount) {
                case 0:
                    getSpot(scenicSpot, amountMaps, 1, r);
                    break;
                case 1:
                    getSpot(scenicSpot, amountMaps, 2, r);
                    break;
                case 2:
                    getSpot(scenicSpot, amountMaps, 3, r);
                    break;
                case 3:
                    getSpot(scenicSpot, amountMaps, 4, r);
                    break;
            }
        }

        System.out.println(amountMaps);

    }

    private static void getSpot(String[] scenicSpot, Map<String, Integer> amountMaps, int count, Random r) {
        Set<Integer> indexSet3 = new TreeSet<>();
        while (indexSet3.size() < count) {
            int index2 = r.nextInt(4);
            indexSet3.add(index2);
        }
        for (Integer indexTemp : indexSet3) {
            if (amountMaps.containsKey(scenicSpot[indexTemp])) {
                amountMaps.put(scenicSpot[indexTemp], amountMaps.get(scenicSpot[indexTemp]) + 1);
            } else {
                amountMaps.put(scenicSpot[indexTemp], 1);
            }
        }
    }

}
