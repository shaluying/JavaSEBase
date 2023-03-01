package 单元测试_反射_注解_动态代理11.反射02.反射获取类对象02;

/*
   目标：反射的第一步：获取Class对象

反射的第一步是什么？
    获取Class类对象，如此才可以解析类的全部成分
获取Class类的对象的三种方式
    方式一：Class c1 = Class.forName(“全类名”);
    方式二：Class c2 = 类名.class
    方式三：Class c3 = 对象.getClass();

 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 1、Class类中的一个静态方法：forName(全限名：包名 + 类名)
        Class c = Class.forName("单元测试_反射_注解_动态代理11.反射02.反射获取类对象02.Student");
        System.out.println(c); // Student.class

        // 2、类名.class
        Class c1 = Student.class;
        System.out.println(c1);

        // 3、对象.getClass() 获取对象对应类的Class对象。
        Student s = new Student();
        Class c2 = s.getClass();
        System.out.println(c2);
    }
}
