package 面向对象中.继承02.子类调用父类成员及重写02;

/*
在继承的时候，子类会继承父类所有的成员变量（实例变量）和成员方法（实例方法）。
既然可以继承，
--------(1)在子类外面
只要权限修饰符允许，通过子类对象可以直接使用父类中声明的成员变量（实例变量）和成员方法（实例方法）
(2)在子类里面
只要权限修饰符允许，可以直接使用父类中声明的成员变量（实例变量）和成员方法（实例方法）
不需要通过“对象.”的方式来引用
 */

public class TestMember {
    public static void main(String[] args) {
        // 创建子类对象
        SmartPhone sp = new SmartPhone();

        sp.name = "苹果手机";  // 父类中name属性的修饰符是protect
        sp.setPrice(10001);  // 父类中price属性的修饰符是private

        System.out.println("手机名字：" + sp.name + " 价格：" + sp.getPrice());
        System.out.println("----------------------------");

        sp.sendMessage();  // 调用了父类的方法
        sp.call();  // 调用了父类的方法
        sp.showNumber();  // 调用了子类中重写的父类方法
        System.out.println("---------------------");

        System.out.println(sp.getInfo());  // 调用了自己的方法

    }
}
