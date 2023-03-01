package 集合04.大作业05.Comparator增强for_Collections01;

/*
有四名学生参加注册会计师考试,表格中记录的是4名学生的考试成绩,
请按照成绩将四名学生从小到大进行排名,并将结果展示出来.
 */

import java.util.*;

public class Test {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Collections.addAll(students, new Student("10", "阿拉克", 89), new Student("11", "啊发大水", 96), new Student("13", "实的费", 87), new Student("18", "周晓鸥", 95));
        System.out.println(students);


        Collections.sort(students, (student, t1) -> Double.compare(student.getScore(), t1.getScore()));
        System.out.println(students);

    }
}
