package day0121_11teacher_code.com.atguigu.constructor;

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
