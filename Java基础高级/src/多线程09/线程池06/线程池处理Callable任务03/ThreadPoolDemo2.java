package 多线程09.线程池06.线程池处理Callable任务03;

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

public class ThreadPoolDemo2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = new ThreadPoolExecutor(3, 5,
                6, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        Callable<String> callable = new MyCallable(50);
        pool.submit(callable);

        Future<String> future = pool.submit(new MyCallable(100));
        String s = future.get();
        System.out.println(s);

        String s1 = pool.submit(new MyCallable(200)).get();
        System.out.println(s1);

        System.out.println(pool.submit(new MyCallable(300)).get());

        //只有当线程执行完Callable任务才会执行get()方法得到返回值！！！
        Future<String> f2 = pool.submit(new MyCallable(400));
        Future<String> f3 = pool.submit(new MyCallable(500));
        System.out.println(f2.get());
        System.out.println(f3.get());

    }
}
