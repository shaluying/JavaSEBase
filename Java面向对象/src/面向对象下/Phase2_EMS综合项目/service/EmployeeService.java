package 面向对象下.Phase2_EMS综合项目.service;

import 面向对象下.Phase2_EMS综合项目.domain.Architect;
import 面向对象下.Phase2_EMS综合项目.domain.Designer;
import 面向对象下.Phase2_EMS综合项目.domain.Employee;
import 面向对象下.Phase2_EMS综合项目.domain.Programmer;

/*
这是一个具有管理功能的功能类. 内部数据不允许外部随意修改, 具有更好的封装性.
 */

public class EmployeeService {
    private int total = 1;// 为添加的新成员的id赋值的
    Employee[] employees = new Employee[15];//用来保存员工对象的数组, 始终保持结构良好 : 前面都是连续的有效对象,后面是连续的空洞.
    private int realCount;//记录已保存员工对象的数量

    //获取当前所有员工。
    //返回：包含所有员工对象的数组
    public Employee[] getALLEmployees() {
        Employee[] allEmployees = new Employee[realCount];
        for (int i = 0; i < allEmployees.length; i++) {
            allEmployees[i] = employees[i];
        }
        return allEmployees;
    }

    //获取指定ID的员工对象。
    //参数：指定员工的ID
    //返回：指定员工对象
    public Employee getEmployee(int id) {
        for (int i = 0; i < realCount; i++) {
            if (id == employees[i].getId()) {
                return employees[i];
            }
        }
        return null;
    }

    //添加新员工
    //参数：员工对象
    //返回值 : 错误编号(1~4) 对应添加错误消息
    public int addEmployee(Employee emp) {
        int architectCount = 0;
        int designerCount = 0;
        int programmerCount = 0;
        for (int i = 0; i < realCount; i++) {
            if (employees[i] instanceof Architect) {
                architectCount++;
            } else if (employees[i] instanceof Designer) {
                designerCount++;
            } else if (employees[i] instanceof Programmer) {
                programmerCount++;
            }
        }

        //1 开发人员已满，无法添加
        if (architectCount + designerCount + programmerCount == 10) {
            return 1;
        }
        if (emp instanceof Architect) {
            if (architectCount == 2) { //2 : 最多只能有两名架构师
                return 2;
            }
        } else if (emp instanceof Designer) {
            if (designerCount == 3) { //3 : 最多只能有三名设计师
                return 3;
            }
        } else if (emp instanceof Programmer) {
            if (programmerCount == 5) {//4 : 最多只能有五名程序员
                return 4;
            }
        }
        if (realCount == employees.length) {//5 数组已满无法添加
            return 5;
        }
        emp.setId(total++);
        employees[realCount++] = emp;
        return 0;
    }

    //删除指定id的员工
    //参数：员工ID
    public boolean removeEmployee(int id) {
        for (int i = 0; i < realCount; i++) {
            if (id == employees[i].getId()) {
                for (int j = i; j < realCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--realCount] = null;
                return true;
            }
        }
        return false;
    }
}
