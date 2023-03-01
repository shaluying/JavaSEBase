package 面向对象中.多态03.大作业07.男人女人类;

/*在Person类中，包含

- 属性：姓名，年龄，职业
- ==提供有参构造 public Person(String name, int age, String job)==
- public void eat()：打印xx吃饭，xx代表姓名
- public void toilet()：打印xx上洗手间
- public String getInfo()：返回姓名、年龄、职业信息。
*/

public class Person {
    String name;
    int age;
    String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public void eat() {
        System.out.println(name + "吃饭");
    }

    public void toilet() {
        System.out.println(name + "上洗手间");
    }

    public String getInfo() {
        return "姓名：" + name + "，年龄：" + age + "，职业信息：" + job;
    }


}
