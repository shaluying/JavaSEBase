package 单元测试_反射_注解_动态代理11.注解03.注解解析04;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
   目标：完成注解的解析

注解的解析
注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，
存在注解就解析出内容。

与注解解析相关的接口
Annotation: 注解的顶级接口，注解都是Annotation类型的对象
AnnotatedElement:该接口定义了与注解解析相关的解析方法

获得当前对象上使用的所有注解，返回注解数组。
Annotation[] getDeclaredAnnotations()

根据注解类型获得对应注解对象
T getDeclaredAnnotation(Class<T> annotationClass)

判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false
boolean isAnnotationPresent(Class<Annotation> annotationClass)

 */
public class AnnotationDemo3 {
    @Test
    public void parseClass() {
        // a.先得到类对象
        Class c = BookStore.class;
        // b.判断这个类上面是否存在这个注解
        if (c.isAnnotationPresent(Bookk.class)) {
            //c.直接获取该注解对象
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }

    @Test
    public void parseMethod() throws NoSuchMethodException {
        // a.先得到类对象
        Class c = BookStore.class;

        Method m = c.getDeclaredMethod("test");

        // b.判断这个类上面是否存在这个注解
        if (m.isAnnotationPresent(Bookk.class)) {
            //c.直接获取该注解对象
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.author()));
        }
    }
}

@Bookk(value = "《情深深雨濛濛》", price = 99.9, author = {"琼瑶", "dlei"})
class BookStore {

    @Bookk(value = "《三少爷的剑》", price = 399.9, author = {"古龙", "熊耀华"})
    public void test() {
    }
}

