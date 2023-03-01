package 面向对象中.Phase1_EMS综合项目.view;

import 面向对象中.Phase1_EMS综合项目.domain.Employee;
import 面向对象中.Phase1_EMS综合项目.service.EmployeeService;
import 面向对象中.Phase1_EMS综合项目.util.EMSUtility;

public class EmployeeView {
    private EmployeeService empService = new EmployeeService(10);

    //用途：显示主菜单，响应用户输入，根据用户操作分别调用其他相应的成员方法
    public void enterMainMenu() {
        while (true) {
            System.out.println("-----------------员工信息管理-----------------");
            System.out.println();
            System.out.println("                  1 添加员工");
            System.out.println("                  2 修改员工");
            System.out.println("                  3 删除员工");
            System.out.println("                  4 员工列表");
            System.out.println("                  5 退   出");
            System.out.println();
            System.out.print("                  请选择(1-5)：_");
            switch (EMSUtility.readMenuSelection()) {
                case '1':
                    addNewEmployee();
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
                case '5':
                    System.out.print("确认退出吗(Y/N):");
                    if (EMSUtility.readConfirmSelection() == 'Y') {
                        return;
                    }
                    break;
            }
        }
    }

    private void addNewEmployee() {
        System.out.println("---------------------添加员工---------------------");
        System.out.print("姓名；");
        String name = EMSUtility.readString(10);
        System.out.print("性别：");
        char gender = EMSUtility.readChar();
        System.out.print("年龄：");
        int age = EMSUtility.readInt();
        System.out.print("工资：");
        double salary = EMSUtility.readDouble();
        System.out.print("电话：");
        String phone = EMSUtility.readString(13);
        System.out.print("邮箱：");
        String email = EMSUtility.readString(20);
        Employee emp = new Employee(name, gender, age, salary, phone, email);
        if (empService.addEmployee(emp)) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------超出存储上限添加失败!---------------------");
        }
    }

    private void modifyEmployee() {
        System.out.println("---------------------修改员工---------------------");
        while (true) {
            System.out.print(" 请选择待修改员工编号(-1退出)：");
            int id = EMSUtility.readInt();
            Employee emp = empService.getEmployee(id - 1);
            if (id == -1) {
                return;
            } else if (emp == null) {
                System.out.println("没有此编号员工！");
                break;
            } else {
                System.out.print("姓名(" + emp.getName() + ")：");
                emp.setName(EMSUtility.readString(10, emp.getName()));

                System.out.print("性别(" + emp.getGender() + ")：");
                emp.setGender(EMSUtility.readChar(emp.getGender()));

                System.out.print("年龄(" + emp.getAge() + ")：");
                emp.setAge(EMSUtility.readInt(emp.getAge()));

                System.out.print("工资(" + emp.getSalary() + ")：");
                emp.setSalary(EMSUtility.readDouble(emp.getSalary()));

                System.out.print("电话(" + emp.getPhone() + ")：");
                emp.setPhone(EMSUtility.readString(13, emp.getPhone()));

                System.out.print("邮箱(" + emp.getEmail() + ")：");
                emp.setEmail(EMSUtility.readString(20, emp.getEmail()));

                System.out.println("---------------------修改完成---------------------");
                return;
            }
        }
    }

    private void deleteEmployee() {
        System.out.println("---------------------删除员工---------------------");
        while (true) {
            System.out.print("请选择待删除员工编号(-1退出)：");
            int id = EMSUtility.readInt();
            if (id == -1) {
                return;
            }
            System.out.print("确认是否删除(Y/N)：");
            if (EMSUtility.readConfirmSelection() == 'N') {
                continue;
            }
            if (empService.removeEmploee(id - 1)) {
                System.out.println("---------------------删除完成---------------------");
                return;
            } else {
                System.out.println("没有此编号员工！");
            }

        }
    }

    private void listAllEmployees() {
        Employee[] allEmployees = empService.getAllEmployees();
        System.out.println("----------------------------员工列表------------------------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t\t工资\t\t电话\t\t邮箱");
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println((i + 1) + "\t\t" + allEmployees[i].getName() + "\t\t" + allEmployees[i].getGender() + "\t\t" + allEmployees[i].getAge() + "\t" + allEmployees[i].getSalary() + "\t" + allEmployees[i].getPhone() + "\t" + allEmployees[i].getEmail());
        }
        System.out.println("--------------------------员工列表完成----------------------------");
    }

}
