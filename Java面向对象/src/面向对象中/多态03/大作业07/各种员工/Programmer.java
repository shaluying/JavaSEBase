package 面向对象中.多态03.大作业07.各种员工;

/*程序员Programmer类，继承普通员工类
- 提供无参构造
- 提供有参构造Programmer(int id, String name, int age, double salary)
- 重写String getInfo()方法，增加职位“程序员”信息
*/

public class Programmer extends Employee{
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    String getInfo() {
        return super.getInfo()+"\t"+"程序员";
    }
}
