package 多线程09.大作业08.存钱01;

/*
本案例模拟一个简单的银行系统,使用两个不同的线程向同一个账户存钱。
账户的初始余额是1000元，两个线程每次存储100元,分别各存储1000元，不允许出现错误数据。
不要求轮流存
 */

public class Test {
    public static void main(String[] args) {
        Account account = new Account(1000);

        new MyThread(account, "小王").start();
        new MyThread(account, "小李").start();


    }
}
