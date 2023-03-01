package 多线程09.线程通信05;

/*
   取钱的线程类
 */
public class DrawThread extends Thread {
    // 接收处理的账户对象
    private Account acc;

    public DrawThread(Account acc, String name) {
        super(name);
        this.acc = acc;
    }

    @Override
    public void run() {
        // 小明 小红：取钱
        while (true) {
            try {
                acc.drawMoney(100000);
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
