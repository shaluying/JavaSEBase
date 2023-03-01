package 多线程09.线程安全问题03;

/*
多个线程同时操作同一个共享资源的时候可能会出现业务安全问题，称为线程安全问题。

需求：小明和小红是一对夫妻，他们有一个共同的账户，余额是10万元。
如果小明和小红同时来取钱，而且2人都要取钱10万元，可能出现什么问题呢？

线程安全问题出现的原因？
存在多线程并发
同时访问共享资源
存在修改共享资源

 */

public class Test {
    public static void main(String[] args) {
        //创建共同的账户
        Account account = new Account("alsfda", 100000);

        //创建两个线程将account账户传进去模拟同时取钱
        Thread t1 = new DrawThread(account, "小明");
        Thread t2 = new DrawThread(account, "小红");

        t1.start();
        t2.start();

//        System.out.println("账户余额：" + account.getMoney());

    }
}
