package 多线程09.大作业08.存钱01;

public class Account {
    private double money = 1000;

    public Account() {
    }

    public Account(double money) {
        this.money = money;
    }

    public synchronized void dispoit(double money) {
        String name = Thread.currentThread().getName();
        this.money += money;
        System.out.println(name + "来存了" + money + "，账户余额：" + this.money);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
