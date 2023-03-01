package 单元测试_反射_注解_动态代理11.反射02.练习08.test02;

import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class Test {
    public static void main(String[] args) throws Exception {
        //获取类加载器
        ClassLoader classLoader = Test.class.getClassLoader();
        //获取对应文件资源的字符输入流
        InputStreamReader isr = new InputStreamReader(classLoader.getResourceAsStream("单元测试_反射_注解_动态代理11\\反射02\\练习08\\test02\\hmDataSourceConfig.properties"), "GBK");

        Properties properties = new Properties();

        //通过输入流加载文件资源内容到集合中
        properties.load(isr);

        //获取类的全名称
        String classname = properties.getProperty("DataSourceName");

        //根据类的全名获取类对象
        Class clazz = Class.forName(classname);

        //获取成员变量
        Field[] fields = clazz.getDeclaredFields();

        //获取对象
        Object obj = clazz.getDeclaredConstructor().newInstance();
        System.out.println(obj);

        Set<String> strings = properties.stringPropertyNames();
//        Collection<Object> values = properties.values();

        for (String str : strings) {
            for (Field field : fields) {
                if (str.equals(field.getName())) {
                    field.setAccessible(true);//暴力反射
                    field.set(obj, properties.get(str));
                }
            }
        }

        System.out.println(obj);


    }
}
