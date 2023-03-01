package day0118_09teacher_code.com.atguigu.encapsulability.other;
//package语句只要不完全一致，就是不同的包

import day0118_09teacher_code.com.atguigu.encapsulability.Father;

//extends：继承
//Son就是Father的子类
public class Son extends Father {//Son儿子，这里表示子类

    public void method() {
        //System.out.println(a);//不行，因为a是private，只能本类
        //System.out.println(b);//不行，因为b的权限修饰符是缺省，只能本包
        System.out.println(c);//可以
        System.out.println(d);
    }
}
