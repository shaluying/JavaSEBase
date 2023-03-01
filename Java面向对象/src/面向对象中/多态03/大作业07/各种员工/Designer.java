package 面向对象中.多态03.大作业07.各种员工;

/*设计师Designer类，继承程序员类
- 增加奖金属性
- ==提供无参构造==
- ==提供有参构造Designer(int id, String name, int age, double salary, double bonus)==
- 重写String getInfo()方法，增加职位“设计师”和奖金信息
*/

public class Designer extends Programmer {
    double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    @Override
    String getInfo() {
        return super.getInfo() + "\t" + "设计师" + "\t" + bonus;
    }
}
