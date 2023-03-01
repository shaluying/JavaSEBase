package 多线程09.线程池06.Executors工具类实现线程池04;

import thread_app.com.itheima.d8_threadpool.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    目标：使用Executors的工具方法直接得到一个线程池对象。

    Executors：线程池的工具类通过调用方法返回不同类型的线程池对象。
public static ExecutorService newCachedThreadPool()                                 线程数量随着任务增加而增加，如果线程任务执行完毕且空闲了一段时间则会被回收掉。
public static ExecutorService newFixedThreadPool​(int nThreads)                     创建固定线程数量的线程池，如果某个线程因为执行异常而结束，那么线程池会补充一个新线程替代它。
public static ExecutorService newSingleThreadExecutor ()                            创建只有一个线程的线程池对象，如果该线程出现异常而结束，那么线程池会补充一个新线程。
public static ScheduledExecutorService newScheduledThreadPool​(int corePoolSize)    创建一个线程池，可以实现在给定的延迟后运行任务，或者定期执行任务。

注意：
Executors的底层其实也是基于线程池的实现类ThreadPoolExecutor创建线程池对象的。
Executors使用可能存在的陷阱
大型并发系统环境中使用Executors如果不注意可能会出现系统风险。
public static ExecutorService newFixedThreadPool​(int nThreads) 允许请求的任务队列长度是Integer.MAX_VALUE，
public static ExecutorService newSingleThreadExecutor ()        可能出现OOM错误（ java.lang.OutOfMemoryError ）

public static ExecutorService newCachedThreadPool()                               创建的线程数量最大上限是Integer.MAX_VALUE，
public static ScheduledExecutorService newScheduledThreadPool​(int corePoolSize)  线程数可能会随着任务1:1增长，也可能出现OOM错误（ java.lang.OutOfMemoryError ）

总结
Executors工具类底层是基于什么方式实现的线程池对象？
线程池ExecutorService的实现类：ThreadPoolExecutor

Executors是否适合做大型互联网场景的线程池方案？
不合适。
建议使用ThreadPoolExecutor来指定线程池参数，这样可以明确线程池的运行规则，规避资源耗尽的风险。

 */
public class ThreadPoolDemo3 {
    public static void main(String[] args) throws Exception {
        // 1、创建固定线程数据的线程池
        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable());
        pool.execute(new MyRunnable()); // 已经没有多余线程了
    }
}
