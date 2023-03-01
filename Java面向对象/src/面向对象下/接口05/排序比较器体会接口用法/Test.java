package 面向对象下.接口05.排序比较器体会接口用法;

/*
在测试类创建Employee[]元素数组，长度为5，创建5个员工对象
- 按照编号从小到大排序输出
- 按照编号从大到小排序输出（声明一个类实现Comparator接口，实现按照编号逆序比较大小）
- 按照薪资从低到高排序输出（声明一个类实现Comparator接口，实现按照薪资比较大小）
- 按照年龄从大到小排序输出（声明一个类实现Comparator接口，实现按照年龄逆序比较大小）
 */

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(1, "李四", 10000, 30);
        employees[1] = new Employee(4, "张三", 16000, 56);
        employees[2] = new Employee(3, "王五", 15230, 34);
        employees[3] = new Employee(5, "赵六", 25000, 25);
        employees[4] = new Employee(2, "刘七", 19000, 46);

        ArrayTools.print(employees);
        ArrayTools.sort(employees);
        System.out.println("按编号从小到大排序后：");
        ArrayTools.print(employees);

        EmployeeIDComparator idc = new EmployeeIDComparator();
        ArrayTools.sort(employees, idc);
        System.out.println("按编号从大到小排序后：");
        ArrayTools.print(employees);

        EmployeeSalaryComparator sac = new EmployeeSalaryComparator();
        ArrayTools.sort(employees, sac);
        System.out.println("按薪资从低到高排序后：");
        ArrayTools.print(employees);

        EmployeeAgeComparator agc = new EmployeeAgeComparator();
        ArrayTools.sort(employees, agc);
        System.out.println("按年龄从大到小排序后：");
        ArrayTools.print(employees);

    }
}
