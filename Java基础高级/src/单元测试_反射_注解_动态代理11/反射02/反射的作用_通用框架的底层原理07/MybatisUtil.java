package 单元测试_反射_注解_动态代理11.反射02.反射的作用_通用框架的底层原理07;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class MybatisUtil {
    /*
     保存任意类型的对象
     * @param obj
     */
    public static void save(Object obj) {
        try (
                PrintStream ps = new PrintStream(new FileOutputStream("Java基础高级\\src\\单元测试_反射_注解_动态代理11\\反射02\\反射的作用_通用框架的底层原理07/data.txt", true));
        ) {
            // 1、提取这个对象的全部成员变量：只有反射可以解决
            Class c = obj.getClass();  //   c.getSimpleName()获取当前类名   c.getName获取全限名：包名+类名
            ps.println("================" + c.getSimpleName() + "================");

            // 2、提取它的全部成员变量
            Field[] fields = c.getDeclaredFields();
            // 3、获取成员变量的信息
            for (Field field : fields) {
                String name = field.getName();
                // 提取本成员变量在obj对象中的值（取值）
                field.setAccessible(true);
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
