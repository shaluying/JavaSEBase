package 多线程09.线程同步04.Lock锁03;

/*
    需求：模拟取钱案例。

    Lock锁
为了更清晰的表达如何加锁和释放锁，JDK5以后提供了一个新的锁对象Lock，更加灵活、方便。
Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作。
Lock是接口不能直接实例化，这里采用它的实现类ReentrantLock来构建Lock锁对象。

 */
public class ThreadDemo {
    public static void main(String[] args) {
        // 1、定义线程类，创建一个共享的账户对象
        Account acc = new Account("ICBC-111", 100000);

        // 2、创建2个线程对象，代表小明和小红同时进来了。
        new DrawThread(acc, "小明").start();
        new DrawThread(acc, "小红").start();
    }
}
