package 单元测试_反射_注解_动态代理11.反射02.反射的作用_通用框架的底层原理07;

public class Teacher {
    private String name;
    private char sex;
    private double salary;

    public Teacher(){

    }

    public Teacher(String name, char sex, double salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
