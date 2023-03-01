package 面向对象下.Phase2_EMS综合项目.view;

import 面向对象下.Phase2_EMS综合项目.domain.Architect;
import 面向对象下.Phase2_EMS综合项目.domain.Designer;
import 面向对象下.Phase2_EMS综合项目.domain.Employee;
import 面向对象下.Phase2_EMS综合项目.domain.Programmer;
import 面向对象下.Phase2_EMS综合项目.service.EmployeeService;
import 面向对象下.Phase2_EMS综合项目.util.EMSUtility;
import 面向对象下.接口05.接口练习07.游泳和跑步接口.Rabbit;

import javax.crypto.spec.PSource;
import java.time.Year;

public class EmployeeView {
    EmployeeService empSvc = new EmployeeService();

    //主界面显示及控制方法。
    public void enterMainMenu() {
        do {
            System.out.println("---------------------------------------------------------------------------------------------------");
            System.out.print("1-添加员工  2-修改员工  3-删除员工  4-员工列表  5-退出   请选择(1-5)：");
            char command = EMSUtility.readMenuSelection();
            switch (command) {
                case '1':
                    addEmployee();
                    break;
                case '2':
                    modifyEmployee();
                    break;
                case '3':
                    deleteEmployee();
                    break;
                case '4':
                    listAllEmployees();
                    break;
                default:
                    return;
            }
        } while (true);

    }

    //以表格形式列出公司所有成员
    private void listAllEmployees() {
        System.out.println("-------------------------------------员工信息管理--------------------------------------");
        System.out.println("ID" + "\t姓名" + "\t年龄" + "\t工资" + "\t职位" + "\t奖金" + "\t股票");
        Employee[] allEmployees = empSvc.getALLEmployees();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i].say());
        }
        System.out.println("---------------------------------------------------------------------------------------------------");

    }

    //实现添加员工操作
    private void addEmployee() {
        System.out.println("---------------------添加员工-------------------------------");
        System.out.print("姓名：");
        String name = EMSUtility.readString(10);
        System.out.print("年龄：");
        int age = EMSUtility.readInt();
        System.out.print("工资：");
        double salary = EMSUtility.readDouble();
        System.out.println("-------------------职位信息列表-----------------------------");
        System.out.println("1. 普通员工 2. 程序员 3. 设计师 4. 架构师");
        System.out.println("---------------------------------------------------------");
        System.out.print("职位：");
        char command = EMSUtility.readChar();

        int re = 0;
        switch (command) {
            case '1':
                re = empSvc.addEmployee(new Employee(0, name, age, salary));
                break;
            case '2':
                re = empSvc.addEmployee(new Programmer(0, name, age, salary));
                break;
            case '3':
                System.out.print("奖金：");
                double bonus = EMSUtility.readDouble();
                re = empSvc.addEmployee(new Designer(0, name, age, salary, bonus));
                break;
            case '4':
                System.out.print("奖金：");
                bonus = EMSUtility.readDouble();
                System.out.println("股票：");
                int stock = EMSUtility.readInt();
                re = empSvc.addEmployee(new Architect(0, name, age, salary, bonus, stock));
                break;
            default:
                System.out.println("职位信息输入有误！");
                break;
        }

        switch (re) {
            case 0:
                System.out.println("添加成功");
                break;
            case 1:
                System.out.println("开发人员已满");
                break;
            case 2:
                System.out.println("最多只能有两名架构师");
                break;
            case 3:
                System.out.println("最多只能有三名设计师");
                break;
            case 4:
                System.out.println("最多只能有五名程序员");
                break;
            case 5:
                System.out.println("数组已满无法添加");
                break;
        }
    }

    //实现修改成员操作
    private void modifyEmployee() {
        System.out.println("---------------------修改员工---------------------");
        while (true) {
            System.out.print("请输入要修改员工的ID(-1退出)：");
            int id = EMSUtility.readInt();

            if (id != -1) {

                Employee emp = empSvc.getEmployee(id);
                if (emp == null) {
                    System.out.println("没有此编号员工！");
                } else {
                    System.out.print("姓名：" + "(" + emp.getName() + ")");
                    emp.setName(EMSUtility.readString(10, emp.getName()));
                    System.out.print("年龄：" + "(" + emp.getAge() + ")");
                    emp.setAge(EMSUtility.readInt(emp.getAge()));
                    System.out.print("工资：" + "(" + emp.getSalary() + ")");
                    emp.setSalary(EMSUtility.readDouble(emp.getSalary()));

                    if (emp instanceof Designer) {
                        System.out.print("奖金：" + "(" + ((Designer) emp).getBonus() + ")");
                        ((Designer) emp).setBonus(EMSUtility.readDouble(((Designer) emp).getBonus()));

                        if (emp instanceof Architect) {
                            System.out.print("股票：" + "(" + ((Architect) emp).getStock() + ")");
                            ((Architect) emp).setStock(EMSUtility.readInt(((Architect) emp).getStock()));
                        }
                    }
                    System.out.println("---------------------修改完成---------------------");
                    return;
                }

            } else {
                return;
            }
        }
    }

    //实现删除成员操作
    private void deleteEmployee() {
        while (true) {
            System.out.print("请输入要删除员工的ID(-1退出)：");
            int id = EMSUtility.readInt();

            if (id != -1) {

                System.out.print("确认是否删除(Y/N)：");
                char command = EMSUtility.readChar();
                if (command == 'Y') {
                    boolean re = empSvc.removeEmployee(id);
                    if (re) {
                        System.out.println("删除成功");
                        break;
                    }
                    System.out.println("没有此编号员工，删除失败");
                } else if (command == 'N') {
                }

            } else {
                break;
            }
        }
    }

}
