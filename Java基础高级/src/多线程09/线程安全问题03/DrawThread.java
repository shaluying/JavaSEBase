package 多线程09.线程安全问题03;

public class DrawThread extends Thread {
    // 接收处理的账户对象
    private Account account;

    @Override
    public void run() {
        // 小明 小红：取钱
        account.drawMoney(100000);
    }

    public DrawThread() {

    }

    public DrawThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
