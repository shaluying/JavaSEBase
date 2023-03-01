package 多线程09.定时器07.ScheduledExecutorService定时器02;

import java.util.Date;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
ScheduledExecutorService是 jdk1.5中引入了并发包，目的是为了弥补Timer的缺陷, ScheduledExecutorService内部为线程池。

得到线程池对象
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)

周期调度方法
public ScheduledFuture<?> scheduleAtFixedRate(Runnable command, long initialDelay, long period,TimeUnit unit)

ScheduledExecutorService的优点
1、基于线程池，某个任务的执行情况不会影响其他定时任务的执行。

 */

public class ScheduledExecutorServiceDemo {
    public static void main(String[] args) {

        ScheduledExecutorService pool = Executors.newScheduledThreadPool(3);

//        pool.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "执行aaa任务" + new Date());
//            }
//        }, 0, 2, TimeUnit.SECONDS);

        pool.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行bbb任务"+ new Date());
            }
        }, 0, 2, TimeUnit.SECONDS);

//        pool.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "执行ccc任务"+ new Date());
//                System.out.println(10 / 0);
//            }
//        }, 0, 2, TimeUnit.SECONDS);

//        pool.scheduleAtFixedRate(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName() + "执行ddd任务"+ new Date());
//            }
//        }, 0, 2, TimeUnit.SECONDS);
    }
}
