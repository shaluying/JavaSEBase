package 多线程09.线程池06.线程池处理Runnable任务02;

import java.util.concurrent.*;

/*
void execute(Runnable command)      执行任务/命令，没有返回值，一般用来执行 Runnable 任务
Future<T> submit(Callable<T> task)  执行Callable任务，返回未来任务对象获取线程结果
void shutdown()                     等任务执行完毕后关闭线程池
List<Runnable> shutdownNow()        立刻关闭，停止正在执行的任务，并返回队列中未执行的任务

新任务拒绝策略
ThreadPoolExecutor.AbortPolicy          丢弃任务并抛出RejectedExecutionException异常。是默认的策略
ThreadPoolExecutor.DiscardPolicy：       丢弃任务，但是不抛出异常 这是不推荐的做法
ThreadPoolExecutor.DiscardOldestPolicy  抛弃队列中等待最久的任务 然后把当前任务加入队列中
ThreadPoolExecutor.CallerRunsPolicy     由主线程负责调用任务的run()方法从而绕过线程池直接执行

    目标：自定义一个线程池对象，并测试其特性。

    ThreadPoolExecutor创建线程池对象示例
ExecutorService pools =
new ThreadPoolExecutor(3, 5,
                       8, TimeUnit.SECONDS,
                       new ArrayBlockingQueue<>(6),
                       Executors.defaultThreadFactory(),
                       new ThreadPoolExecutor.AbortPolicy());
 */
public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        // 1、创建线程池对象
        /*
         public ThreadPoolExecutor(int corePoolSize,
                                 int maximumPoolSize,
                                 long keepAliveTime,
                                 TimeUnit unit,
                                 BlockingQueue<Runnable> workQueue,
                                 ThreadFactory threadFactory,
                                 RejectedExecutionHandler handler)
         */
        ExecutorService pool = new ThreadPoolExecutor
                (3, 5,
                        6, TimeUnit.SECONDS,
                        new ArrayBlockingQueue<>(5),
                        Executors.defaultThreadFactory(),
                        new ThreadPoolExecutor.AbortPolicy());

        //2.创建任务对象
        Runnable target = new MyRunnable();

        //3，将任务对象给线程池处理
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);
        pool.execute(target);

        // 创建临时线程
        pool.execute(target);
        pool.execute(target);
        // 不创建，拒绝策略被触发！！！
//        pool.execute(target);

        // 关闭线程池（开发中一般不会使用）。
//         pool.shutdownNow(); // 立即关闭，即使任务没有完成，会丢失任务的！
        pool.shutdown(); // 会等待全部任务执行完毕之后再关闭（建议使用的）
    }
}
