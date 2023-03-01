package 常用API01.Arraylist02.Arraylist练习案例02.遍历兵删除元素01;

/*
某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100
现在需要先把成绩低于80分以下的数据去掉。
 */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(98);
        list.add(77);
        list.add(66);
        list.add(89);
        list.add(79);
        list.add(50);
        list.add(100);

        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) < 80) {
                list.remove(i);
            }
        }
        System.out.println(list);

    }
}
