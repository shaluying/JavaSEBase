package 面向对象下.包装03.包装类练习04.员工类;

/*
在测试类中创建员工数组，用Data类中的二维数组进行初始化，遍历数组
 */

public class Test {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < empArr.length; i++) {
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);

            switch (type) {
                case Data.EMPLOYEE:
                    empArr[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    empArr[i] = new Programmer(id, name, age, salary);
                    break;
                case Data.DESIGNER:
                    double bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    empArr[i] = new Designer(id, name, age, salary, bonus);
                    break;
                case Data.ARCHITECT:
                    double bonus01 = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    empArr[i] = new Architect(id, name, age, salary, bonus01, stock);
                    break;
            }

            System.out.println(empArr[i]);

        }


    }
}
