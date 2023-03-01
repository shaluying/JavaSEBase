package 多线程09.线程通信05;

public class Account {
    private String cardId;
    private double money; // 账户的余额

    public Account() {

    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }

    public synchronized void deposit(double money) throws InterruptedException {
        if (this.money == 0) {
            String name = Thread.currentThread().getName();
            this.money += money;
            System.out.println(name + "存了" + money + "，账户余额：" + this.money);

            //this代表的是抢到当前锁的锁对象（线程）
            this.notifyAll();//唤醒其他线程
            this.wait();//等待自己
        } else {
            this.notifyAll();//唤醒其他线程
            this.wait();//等待自己
        }
    }


    /*
     *小明 小红
     *this == account 共享账户
     */
    //同步方法 直接锁住整个方法 （锁实例方法底层默认用同步代码块以this锁）
    public synchronized void drawMoney(double money) throws InterruptedException {
        // 0、先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();

        if (this.money >= money) {
            this.money -= money;
            System.out.println(name + "来取钱成功，吐出：" + money + "账户余额：" + this.money);

            this.notifyAll();
            this.wait();
        } else {
            this.notifyAll();
            this.wait();
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
