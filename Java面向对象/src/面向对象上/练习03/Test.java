package 面向对象上.练习03;

public class Test {
    public static void main(String[] args) {
        Employee e01 = new Employee();
        Employee e02 = new Employee();

        e01.name = "张三";
        e02.name = "李四";

        MyDate b01 = new MyDate();
        b01.year = 1996;
        b01.month = 5;
        b01.day = 23;
        e01.birthday = b01;

        e02.birthday = new MyDate();
        e02.birthday.year = 1992;
        e02.birthday.month = 8;
        e02.birthday.day = 15;

        System.out.println(e01.name + "的生日是：" + e01.birthday.year + " " + e01.birthday.month + " " + e01.birthday.day);
        System.out.println(e02.name + "的生日是：" + e02.birthday.year + " " + e02.birthday.month + " " + e02.birthday.day);


    }
}
