package 多线程09.大作业08.领双色球入会场04.teacher;

import java.util.List;
import java.util.Random;

/*
    2、定义线程任务类EntranceTask,实现Runnable接口
        2.1、 定义int类型成员变量num，代表入场人数
        2.2、 定义List类型成员变量doubleColorBalls，存放num张彩票
        2.3、定义构造方法，给成员变量赋值，确定入场人数，准备彩票
        2.4、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能（死循环内部嵌套 同步）
        2.4.1、定义int变量count，记录每个入口进入的人数
        2.4.2、 所有人员都已经入场，结束循环
        2.4.3、 有人员入场，随机抽取一个双色球（注意：抽一个双色球，就少一个）
        2.4.4、 打印输出
        2.4.5、计数器加1
        2.4.6、循环结束，打印每个入口进入的人数
 */
public class EntranceTask implements Runnable {
    //2.1、 定义int类型成员变量num，代表入场人数
    private int num;

    //2.2、 定义List类型成员变量doubleColorBalls，存放num张彩票
    private List<String> doubleColorBalls;

    //2.3、定义构造方法，给成员变量赋值，确定入场人数，准备彩票
    public EntranceTask(int num, List<String> doubleColorBalls) {
        this.num = num;
        this.doubleColorBalls = doubleColorBalls;
    }

    //2.4、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全）
    @Override
    public void run() {
        //2.4.1、定义int变量count，记录每个入口进入的人数
        int count = 0;

        while (true) {
            //同步代码块,使用this作为锁对象
            //this代表线程任务类EntranceTask的对象,而两个线程的任务是相同的,
            //所以只会创建一个线程任务类EntranceTask的对象,保证锁对象的唯一性,从而保证了数据的安全
            synchronized (this) {
                //2.4.2、 所有人员都已经入场，结束循环
                if (num <= 0) {
                    break;
                }

                //2.4.3、 有人员入场，随机抽取一个双色球（注意：抽一个双色球，就少一个）
                String doubleColorBall = doubleColorBalls.remove(new Random().nextInt(doubleColorBalls.size()));

                //2.4.4、 打印输出
                System.out.println("编号为: "+(num--)+" 的员工 从"
                        +Thread.currentThread().getName()+" 入场!"
                        +"拿到的双色球彩票号码是: "+doubleColorBall);

                //2.4.5、计数器加1
                count++;

            }
        }
        //2.4.6、循环结束，打印每个入口进入的人数
        System.out.println("从"+Thread.currentThread().getName()
                +"入场的用功总共: "+count+" 位员工");
    }
}
