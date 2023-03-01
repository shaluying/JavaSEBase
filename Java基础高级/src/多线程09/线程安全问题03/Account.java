package 多线程09.线程安全问题03;

public class Account {
    private String cardId;
    private double money;

    public void drawMoney(double money) {
        // 0、先获取是谁来取钱，线程的名字就是人名
        String name = Thread.currentThread().getName();
        if (this.money >= money) {
            System.out.println(name+"正在取钱");
            System.out.println("ATM机吐出了"+money);
            this.money -= money;
            System.out.println("账户余额："+this.money);
        }
    }

    public Account() {
    }

    public Account(String cardId, double money) {
        this.cardId = cardId;
        this.money = money;
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
