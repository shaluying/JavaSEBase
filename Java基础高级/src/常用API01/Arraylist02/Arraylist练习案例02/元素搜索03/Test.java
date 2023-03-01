package 常用API01.Arraylist02.Arraylist练习案例02.元素搜索03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 案例：学生信息系统：展示数据，并按照学号完成搜索
 * 学生类信息（学号，姓名，性别，班级）
 * 测试数据：
 * "20180302","叶孤城",23,"护理一班"
 * "20180303","东方不败",23,"推拿二班"
 * "20180304","西门吹雪",26,"中药学四班"
 * "20180305","梅超风",26,"神经科2班"
 */

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("20180302", "叶孤城", 23, "护理一班"));
        students.add(new Student("20180302", "东方不败", 23, "推拿二班"));
        students.add(new Student("20180302", "西门吹雪", 26, "中药学四班"));
        students.add(new Student("20180302", "梅超风", 26, "神经科二班"));

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入想要查询学生的学号：");
            String id = sc.next();

            for (int i = 0; i < students.size(); i++) {
                if (id.equals(students.get(i).getId())) {
                    System.out.println(students.get(i));
                    break;
                }
                if (i == students.size()-1) {
                    System.out.println("查无此人！");
                }
            }

        }

    }
}
