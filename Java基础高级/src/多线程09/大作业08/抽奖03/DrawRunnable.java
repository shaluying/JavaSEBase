package 多线程09.大作业08.抽奖03;

import java.util.List;
import java.util.Random;

public class DrawRunnable implements Runnable {
    private List<String> list;

    public DrawRunnable() {
    }

    public DrawRunnable(List<String> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                String name = Thread.currentThread().getName();
                if (list.size() > 0) {
                    Random r = new Random();
                    String goods = list.get(r.nextInt(list.size()));
                    list.remove(goods);
                    System.out.println(name + "..." + "抽出了一个：" + goods);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                } else {
                    break;
                }
            }
        }
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

}
