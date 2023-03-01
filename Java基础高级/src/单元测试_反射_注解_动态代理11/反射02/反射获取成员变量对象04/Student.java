package 单元测试_反射_注解_动态代理11.反射02.反射获取成员变量对象04;

public class Student {
    private String name;
    private int age;
    public static String schoolName;
    public static final String COUNTTRY = "中国";

    public Student() {
        System.out.println("无参数构造器执行！");
    }

    public Student(String name, int age) {
        System.out.println("有参数构造器执行！");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
