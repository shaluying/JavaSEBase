package day0208_14teacher_code.com.atguigu.review;

public class MyClass extends MyFather implements MyInter {

    public void method(){
        System.out.println(super.MAX_VALUE);
        System.out.println(MyInter.MAX_VALUE);
    }
}
