package 多线程09.大作业08.抽奖03.teacher;

import java.util.List;
import java.util.Random;

/*
    1、定义线程任务类CJTask,实现Runnable接口
        1.1、 定义List类型成员变量prizeList，代表抽奖池
        1.2、 定义构造方法，初始化抽奖池
        1.3、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能（死循环内部嵌套 同步）
        1.3.1、 没有奖品，结束循环
        1.3.2、有奖品，从抽奖池中随机抽取一个（注意：抽一个奖品，抽奖池中就少一个）
        1.3.3、打印输出
 */
public class CJTask implements Runnable {
    //1.1、 定义List类型成员变量prizeList，代表抽奖池
    private List<String> prizeList;

    //1.2、 定义构造方法，初始化抽奖池
    public CJTask(List<String> prizeList) {
        this.prizeList = prizeList;
    }

    //1.3、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全）
    @Override
    public void run() {
        while (true) {
            //使用同步代码块,this作为锁对象
            //this代表线程任务类CJTask的对象,而两个线程的任务是相同的,所以线程任务类CJTask的对象只有一个
            //保证了锁对象的唯一性,从而保证了数据的安全
            synchronized (this) {
                //1.3.1、 没有奖品，结束循环
                if (prizeList.size() <= 0) {
                    break;
                }

                //1.3.2、有奖品，从抽奖池中随机抽取一个（注意：抽一个奖品，抽奖池中就少一个）
                //创建Random对象
                Random random = new Random();
                //产生一个List集合索引范围内的随机的int数字
                int randomIndex = random.nextInt(prizeList.size());
                //获取一个奖项: 抽奖箱中抽取一个奖项应该少一个奖项
                //所以只能使用remove方法
                String prize = prizeList.remove(randomIndex);
                //1.3.3、打印输出
                System.out.println(Thread.currentThread().getName()
                +"...抽出了一个: "+prize);

                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
