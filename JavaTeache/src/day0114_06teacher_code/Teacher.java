package day0114_06teacher_code;

public class Teacher {
    //属性
    String name;
    int age;
    char gender;

    //方法
    void eat(){
        if(age >=25 && age<=60){
            System.out.println("吃的口味比较重");
        }else if(age>60){
            System.out.println("吃的比较清淡");
        }
    }
}
