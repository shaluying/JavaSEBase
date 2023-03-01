package 面向对象中.封装01.封装概念及修饰符01.two;
//package语句只要不完全一致，就是不同的包

import 面向对象中.封装01.封装概念及修饰符01.one.Father;

//extends：继承
//Son是Father的子类
public class Son extends Father {
    public void method() {
        // System.out.println(a);//不行，因为a是private，只能本类
        // System.out.println(b);//不行，因为b的权限修饰符是缺省，只能本包
        System.out.println(c);
        System.out.println(d);
    }
}
