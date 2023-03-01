package 集合04.大作业05.HashSet增强for_ArrayList_Collections02;

/*
彩票双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红
色球号码从1~33中选择；蓝色球号码从1~16中选择；
请结合集合所学知识，随机生成一注双色球号码，要求同色号码不重复。
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Integer> dualColorSet = new HashSet<>();

        Random r = new Random();
        while (dualColorSet.size() < 6) {
            dualColorSet.add(r.nextInt(33) + 1);
        }

        List<Integer> dualColorList = new ArrayList<>();
        for (Integer red : dualColorSet) {
            dualColorList.add(red);
        }
        Collections.sort(dualColorList);

        dualColorList.add(r.nextInt(16) + 1);

        System.out.println(dualColorList);
        System.out.println("---------------------");

    }
}
