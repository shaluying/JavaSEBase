package 集合和泛型03.大作业03.ArrayList03;

/*
编号  姓名  分数
1    小亮   99
2    小强   85
3    小响   90
4    小勇   75

有4个人参加公务员考试,考试成绩如图所示,
录取3名学生,淘汰分数最低的一名,设计一个程序,完成需求
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(99);
        list.add(85);
        list.add(90);
        list.add(75);
        System.out.println(list);

        int index = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                index = i + 1;
            }
        }
        list.remove(index);

        System.out.println(list);
    }


}

