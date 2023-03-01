package day0121_11teacher_code.com.atguigu.exer2;

/*
（5）声明一个子类Manager经理，继承SalaryEmployee

- 增加属性：奖金比例，私有化，提供get/set方法
- 提供有参构造public Manager(String name, double salary, MyDate birthday, double bonusRate)
- 提供有参构造public Manager(String name,double salary,  int year, int month ,int day, double bonusRate)
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 *(1+奖金比例)
- 重写方法，public String getInfo()：显示姓名和实发工资，生日，奖金比例
 */
public class Manager  extends SalaryEmployee {
    private double bonusRate;//奖金比例

    public Manager(String name, double salary, MyDate birthday, double bonusRate) {
        super(name, salary, birthday);
        this.bonusRate = bonusRate;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonusRate) {
        super(name, salary, year, month, day);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }
    /*
    重写方法，public double earning()返回实发工资， 实发工资 = 薪资 *(1+奖金比例)
- 重写方法，public String getInfo()：显示姓名和实发工资，生日，奖金比例
     */

    @Override
    public double earning() {
//        return salary *  (1+bonusRate);//salary是在父类中声明的，而且是private，子类中无法直接使用
//        return getSalary() *  (1+bonusRate);//可以
        return super.earning() *  (1+bonusRate);//因为super.earning()在父类中返回的就是salary的值
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
