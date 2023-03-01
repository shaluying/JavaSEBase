package 面向对象中.多态03.大作业07.各种员工;

/*架构师Architect类，继承设计师类
- 增加股票属性
- ==提供无参构造==
- ==提供有参构造Architect(int id, String name, int age, double salary, double bonus, int stock)==
- 重写String getInfo()方法，增加职位“架构师”和奖金、股票信息
*/

public class Architect extends Designer {
    int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    @Override
    String getInfo() {
        return super.getInfo() + "\t" + "架构师" + "\t" + bonus + "\t" + stock;
    }
}
