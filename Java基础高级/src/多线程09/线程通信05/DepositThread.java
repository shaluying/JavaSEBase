package 多线程09.线程通信05;

public class DepositThread extends Thread {
    private Account account;

    public DepositThread() {

    }

    public DepositThread(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        while (true) {
            try {
                account.deposit(100000);
                Thread.sleep(3000);
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
