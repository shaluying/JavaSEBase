package day0122_12teacher_code.com.atguigu.exer.exer1;

public class TestAccount {
    public static void main(String[] args) {
        Account.setRate(0.035);//统一设置利率
        Account a1 = new Account("11111",1000);
        Account a2 = new Account("22222",2000);
        System.out.println(a1);//自动调用对象的toString
        System.out.println(a2);
    }
}
