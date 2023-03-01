package 面向对象下.静态01.static练习03.银行账户类;

/*
在测试类的main中，创建账户类的两个对象，
账号分别为“11111”和“22222”，余额分别为“1000和2000”元，利率初始值是0.035，
调用方法测试。
*/

public class Test {
    public static void main(String[] args) {
        Account.setInterestRate(0.035);
        Account a = new Account("11111", 1000);
        Account b = new Account("22222", 2000);

        System.out.println(a);
        System.out.println(b);


    }

}
