package 多线程09.大作业08.抄单词02.teacher;
/*
    2、定义线程任务类CopyRunnable,实现Runnable接口
        2.1、定义Punishment类型成员变量punishment
        2.2、定义构造方法，给成员变量punishment赋值
        2.3、覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能
 */
public class CopyRunnable implements Runnable{
    //2.1、定义Punishment类型成员变量punishment
    private Punishment punishment;

    //2.2、定义构造方法，给成员变量punishment赋值
    public CopyRunnable(Punishment punishment) {
        this.punishment = punishment;
    }

    //2.3、覆盖重写run方法（使用同步方法或同步代码块保证数据安全）
    @Override
    public void run() {
        //定义int变量count,统计每个线程执行抄写单词的次数,初始值0
        int count = 0;

        while (true) {
            //同步代码块,使用this作为锁对象
            //this代表CopyRunnable类的对象,CopyRunnable类的对象是两个线程共享的线程任务对象,只会创建一个
            //保证了锁对象的唯一性
            synchronized (this) {
                //获取剩余抄写次数
                int leftCount = punishment.getLeftCount();
                //如果leftCount<=0,直接结束while循环
                if (leftCount <= 0) {
                    break;
                }

                System.out.println(Thread.currentThread().getName()
                        +"线程-抄写一遍"+punishment.getCopyWord()+"。两人总共还需要抄写"+(--leftCount)+"次");

                //计数器+1
                count++;

                //修改剩余次数
                punishment.setLeftCount(leftCount);
            }
        }

        //打印当前线程执行抄写单词的总次数
        System.out.println(Thread.currentThread().getName()+"-一共抄写了"+count+"次");
    }
}
