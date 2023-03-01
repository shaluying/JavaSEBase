package 面向对象中.多态03.多态练习04;

/*声明一个子类Manager经理，继承SalaryEmployee

- 增加属性：奖金比例，私有化，提供get/set方法
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 *(1+奖金比例)
- 重写方法，public String getInfo()：显示姓名和实发工资，生日，奖金比例
*/

public class Manager extends SalaryEmployee {
    private double BonusProportion;

    @Override
    public double earning() {
        return super.earning() * (1 + BonusProportion);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "，奖金比例：" + BonusProportion;
    }

    public double getBonusProportion() {
        return BonusProportion;
    }

    public void setBonusProportion(double bonusProportion) {
        BonusProportion = bonusProportion;
    }
}
