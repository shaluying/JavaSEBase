package 单元测试_反射_注解_动态代理11.注解03.自定义注解02;

public @interface Book {
    String value(); // 特殊属性
    double price() ;
    //double price() default 9.9;
}
