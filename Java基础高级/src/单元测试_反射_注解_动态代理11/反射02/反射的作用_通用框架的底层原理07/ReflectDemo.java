package 单元测试_反射_注解_动态代理11.反射02.反射的作用_通用框架的底层原理07;

/*
   目标：提供一个通用框架，支持保存所有对象的具体信息。
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        s.setName("猪八戒");
        s.setClassName("西天跑路1班");
        s.setAge(1000);
        s.setHobby("吃，睡");
        s.setSex('男');
        MybatisUtil.save(s);

        Teacher t = new Teacher();
        t.setName("波仔");
        t.setSex('男');
        t.setSalary(6000);
        MybatisUtil.save(t);
    }
}
