package 面向对象中.多态03.多态练习04;

/*声明一个子类SalaryEmployee正式工，继承父类Employee

- 增加属性，double类型的薪资，MyDate类型的出生日期，私有化，提供get/set方法
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资
- 重写方法，public String getInfo()：显示姓名和实发工资、生日
*/

public class SalaryEmployee extends Employee {
    private double salary;
    private MyDate birthday;

    @Override
    public double earning() {
        return salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，生日：" + birthday.getInfo();
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
