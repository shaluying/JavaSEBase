package 面向对象中.构造器04.练习04;

/*声明一个员工数组，存储各种员工
你现在是人事，遍历查看每个人的详细信息，并统计实发工资总额，通知财务准备资金。

从键盘输入当期月份值，如果他是正式工（包括SalaryEmployee和Manager）
并且是本月生日的，通知领取生日礼物。
*/

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Employee[] emp = new Employee[5];

        HourEmployee hemp = new HourEmployee("张三", 40, 50);
        SalaryEmployee saemp = new SalaryEmployee("李四", 15000, 1998, 8, 9);
        Manager ma = new Manager("王五", 20000, 1993, 4, 23, 2.1);

        emp[0] = hemp;
        emp[1] = saemp;
        emp[2] = ma;

        double sum = 0;
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] == null) {
                break;
            }
            sum += emp[i].earning();
            System.out.println(emp[i].getInfo());
        }
        System.out.println("请财务部门准备" + sum + "的金额用以工资发放");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入当前月份：");
        int mon = sc.nextInt();
        for (int i = 0; i < emp.length; i++) {
            if (emp[i] == null || emp[i] instanceof HourEmployee) {
                continue;
            }
            if (((SalaryEmployee) emp[i]).getBirthday().getMonth() == mon) {
                System.out.println(emp[i].getName() + "本月是你生日月，请来领取礼物！");
            }
        }

    }
}
