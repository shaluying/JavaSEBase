package 面向对象中.多态03.多态练习04;

/*声明一个子类HourEmployee小时工，继承父类Employee

- 有属性，double类型的工作小时数和每小时多少钱
- 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
- 重写方法，public String getInfo()：显示姓名和实发工资，时薪，工作小时数
*/

public class HourEmployee extends Employee {
    double hour;
    double hourlyWage;

    @Override
    public double earning() {
        return hour * hourlyWage;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，时薪：" + hourlyWage + "，工作小时数：" + hour;
    }
}
