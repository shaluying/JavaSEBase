package 面向对象中.构造器04.构造器在继承时的要求03;

public class Father {
    private String info;

    //写了一个无参构造
    public Father(){
        System.out.println("Father.无参构造");
    }

    public Father(String info){
        this.info = info;
        System.out.println("Father.有参构造");
    }
}
