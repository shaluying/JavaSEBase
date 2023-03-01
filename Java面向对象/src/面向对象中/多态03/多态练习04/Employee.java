package 面向对象中.多态03.多态练习04;

/*声明一个父类Employee员工类型，

- 有姓名属性，私有化，提供get/set方法
- public double earning()：代表实发工资，返回0.0
- public String getInfo()：显示姓名和实发工资
*/

public class Employee {
    private String name;


    public double earning() {
        return 0.0;
    }



    public String getInfo() {
        return "姓名：" + name + "，实发工资：" + earning();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
