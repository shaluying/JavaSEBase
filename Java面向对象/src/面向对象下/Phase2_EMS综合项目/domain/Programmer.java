package 面向对象下.Phase2_EMS综合项目.domain;

public class Programmer extends Employee {
    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }

    @Override
    public String say() {
        return super.getInfo()+ "\t程序员";
    }
}

