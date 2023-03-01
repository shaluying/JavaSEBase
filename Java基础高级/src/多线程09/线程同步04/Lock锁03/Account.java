package 多线程09.线程同步04.Lock锁03;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String cardId;
    private double money; // 账户的余额
    private final Lock lock = new ReentrantLock();
    // final修饰后：锁对象是唯一和不可替换的，非常专业

    public Account() {

    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    /*
     *小明 小红
     */
    public void drawMoney(double money) {
        // 0、先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();

        try {
            lock.lock();//锁住
            if (this.money >= money) {
                // 2、取钱
                System.out.println(name + "来取钱成功，吐出：" + money);
                // 3、更新余额
                this.money -= money;
                System.out.println(name + "取钱后剩余：" + this.money);
            } else {
                // 4、余额不足
                System.out.println(name + "来取钱，余额不足！");
            }
        } finally {//无论以上代码是否出现异常必定执行解锁操作
            lock.unlock();//解锁
            //如果不解锁的话其他线程永远也无法进入执行会让程序崩溃
        }


    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

}
