package 面向对象中.封装01.封装概念及修饰符01.two;

import 面向对象中.封装01.封装概念及修饰符01.one.Father;

//Mother它和Father类是不同包的类
//而且Mother也不是Father类的子类
public class Mother {
    public void method(){
        Father f = new Father();
//        System.out.println(f.a);//不行，因为a是private，只能本类
//        System.out.println(f.b);//不行，因为b的权限修饰符是缺省，只能本包
//        System.out.println(f.c);//不行，因为c的权限修饰符是protect，跨包只能是子类
        System.out.println(f.d);
    }
}
