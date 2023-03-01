package 面向对象中.构造器04.构造器在继承时的要求03;

public class Son extends Father {
    public Son(){
//        super();//调用父类的无参构造 ，可以省略
    }
    public Son(String info){
        super(info);//调用父类的有参构造
    }
}
