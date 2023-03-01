package 多线程09.大作业08.存钱01;

public class MyThread extends Thread {
    private Account account;
    private String name;

    public MyThread() {
    }

    public MyThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            account.dispoit(100);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
