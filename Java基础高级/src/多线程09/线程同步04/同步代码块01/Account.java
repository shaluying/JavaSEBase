package 多线程09.线程同步04.同步代码块01;

public class Account {
    private String cardId;
    private double money; // 账户的余额

    public Account() {

    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
    }


    //    // 可能有100个线程访问Account的静态方法
    //此时100个线程共享此方法 用类名作为锁
//    public static void run(){
//        synchronized (Account.class){
//
//        }
//    }


    /**
     * 小明 小红
     */
    public void drawMoney(double money) {
        // 0、先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();
        // 同步代码块
        // 小明 小红
        // this == account 共享账户
        synchronized (this) {
            //共享资源用锁锁起来
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
