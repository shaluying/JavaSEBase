package 面向对象中.继承02.继承练习03.练习一;

/*
（1）声明父类：Person类
- 包含属性：姓名，年龄，性别，属性私有化，
- 包含get/set方法
- 包含getInfo()方法：例如：姓名：张三，年龄：23，性别：男

（2）声明子类：Student类，继承Person类
- 新增属性：score成绩，属性私有化，
- 包含get/set方法
- 重写getInfo()方法：例如：姓名：张三，年龄：23，性别：男，成绩：89

（3）声明子类：Teacher类，继承Person类
- 新增属性：salary薪资，属性私有化，
- 包含get/set方法
- 重写getInfo()方法：例如：姓名：张三，年龄：23，性别：男，薪资：10000

（4）在测试类的main方法中创建三个类的对象，并调用相应的方法测试
*/

public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        Student st = new Student();
        Teacher te = new Teacher();

        st.setName("张三");
        st.setAge(26);
        st.setSex("男");
        st.setScore(89);

        te.setName("李晴");
        te.setAge(38);
        te.setSex("女");
        te.setSalary(12000);

        System.out.println(st.getInfo());
        System.out.println(te.getInfo());
    }
}
