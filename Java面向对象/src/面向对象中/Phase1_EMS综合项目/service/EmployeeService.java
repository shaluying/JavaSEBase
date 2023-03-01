package 面向对象中.Phase1_EMS综合项目.service;

import 面向对象中.Phase1_EMS综合项目.domain.Employee;

public class EmployeeService {
    private Employee[] employees;
    private int realCount = 0;

    //用途：构造器，用来初始化employees数组
    //参数：totalCount：指定employees数组的最大空间
    public EmployeeService(int totalCount) {
        employees = new Employee[totalCount];
    }

    //用途：将参数emp对象添加组中最后一个员工对象记录之后
    //参数：emp指定要添加的员工对象
    //返回：添加成功返回true；false表示数组已满，无法添加
    public boolean addEmployee(Employee emp) {
        if (realCount >= employees.length) {
            return false;
        }
        employees[realCount++] = emp;
        return true;
    }

    //用途：从数组中删除参数index指定索引位置的员工对象记录
    //参数： index指定所删除对象在数组中的索引位置
    //返回：删除成功返回true；false表示索引无效，无法删除
    public boolean removeEmploee(int index) {
        if (index >= 0 && index <= realCount) {
            for (int i = index; i < employees.length - 1; i++) {
                employees[i] = employees[i + 1];
            }
            employees[--realCount] = null;
            return true;
        }
        return false;
    }

    //用途：返回数组中记录的所有员工对象
    //返回： Employee[] 数组中包含了当前所有员工对象，该数组长度与对象个数相同。
    public Employee[] getAllEmployees() {
        Employee[] allEmployees = new Employee[realCount];
        for (int i = 0; i < allEmployees.length; i++) {
            allEmployees[i] = employees[i];
        }
        return allEmployees;
    }

    //用途：返回参数index指定索引位置的员工对象记录
    //参数： index指定所要获取的员工对象在数组中的索引位置
    //返回：封装了员工信息的Employee对象
    public Employee getEmployee(int index) {
        if (index >= 0 && index < realCount) {
            return employees[index];
        }
        return null;
    }
}