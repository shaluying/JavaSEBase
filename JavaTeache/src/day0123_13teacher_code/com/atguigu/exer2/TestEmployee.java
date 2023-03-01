package day0123_13teacher_code.com.atguigu.exer2;

import static day0123_13teacher_code.com.atguigu.exer2.Data.*;

/*
（6）在测试类中创建员工数组，用Data类中的二维数组进行初始化，遍历数组
 */
public class TestEmployee {
    public static void main(String[] args) {
        //创建员工数组,用Data类中的二维数组进行初始化
        /*
        分析发现 Data类的二维数组 EMPLOYEES的行数
        正好是员工数组all的长度
         */
        Employee[] all = new Employee[EMPLOYEES.length];

        /*
        还需要把 Data类的二维数组 EMPLOYEES的每一行转换为一个一个的员工对象。
        发现每一行的员工对象的具体类型还不一样。
        可能是Employee类的对象，可能是Programmer类的对象....
        依据Data类的二维数组 EMPLOYEES的每一行第1列的值来决定是什么类型的员工
         */
        for (int i = 0; i < EMPLOYEES.length; i++) {
            //先取出 二维数组的每一行的第1列
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            switch (type){
                case EMPLOYEE:
                    all[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    all[i] = new Programmer(id,name,age,salary);
                    break;
                case DESIGNER:
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    all[i] = new Designer(id,name,age,salary,bonus);
                    break;
                case ARCHITECT:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    all[i] = new Architect(id,name,age,salary,bonus,stock);
                    break;
            }

            System.out.println(all[i]);
        }

    }
}
