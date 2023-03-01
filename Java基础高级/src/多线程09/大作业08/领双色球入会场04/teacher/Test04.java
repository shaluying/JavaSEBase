package 多线程09.大作业08.领双色球入会场04.teacher;

import java.util.ArrayList;
import java.util.List;

/*
    第四题
        某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,
        假设公司有100个员工,利用多线程模拟年会入场过程,
        并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。

        双色球球规则:
        双色球: 由6个红色球号码和1个蓝色球号码组成。
        红色球: 从1--33中选择。
        蓝色球: 从1--16中选择。
        红球从小到大的顺序,不可重复,蓝球和红球可以重复

    实现步骤:
        1、定义工具类DoubleColorBallUtils,产生双色球
        1.1、 构造方法私有
        1.2、 定义静态方法create,产生一个双色球,返回String
        2、定义线程任务类EntranceTask,实现Runnable接口
        2.1、 定义int类型成员变量num，代表入场人数
        2.2、 定义List类型成员变量doubleColorBalls，存放num张彩票
        2.3、定义构造方法，给成员变量赋值，确定入场人数，准备彩票
        2.4、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能（死循环内部嵌套 同步）	2.4.1、定义int变量count，记录每个入口进入的人数
        2.4.2、 所有人员都已经入场，结束循环
        2.4.3、 有人员入场，随机抽取一个双色球（注意：抽一个双色球，就少一个）
        2.4.4、 打印输出
        2.4.5、计数器加1
        2.4.6、循环结束，打印每个入口进入的人数
        3、定义测试类Test04
        3.1、创建List集合对象doubleColorBalls代表所有的双色球
        3.2、向List集合对象doubleColorBalls中添加所有的双色球
        3.3、创建线程任务EntranceTask类的对象，传递存储双色球的List集合对象doubleColorBalls,并指定入场人数
        3.4、创建2个Thread类的对象，传递线程任务EntranceTask类的对象并指定线程名称
        3.5、2个Thread类的对象分别调用start方法，开启线程
 */
public class Test04 {
    public static void main(String[] args) {
        //定义int变量,代表入场的员工总数量
        int num = 100;

        //3.1、创建List集合对象doubleColorBalls代表所有的双色球
        List<String> doubleColorBalls = new ArrayList<>();

        //3.2、向List集合对象doubleColorBalls中添加所有的双色球
        for (int i = 0; i < num; i++) {
            doubleColorBalls.add(DoubleColorBallUtils.create());
        }

        //3.3、创建线程任务EntranceTask类的对象，传递存储双色球的List集合对象doubleColorBalls,并指定入场人数
        EntranceTask entranceTask = new EntranceTask(num,doubleColorBalls);

        //3.4、创建2个Thread类的对象，传递线程任务EntranceTask类的对象并指定线程名称
        Thread t1 = new Thread(entranceTask,"前门");
        Thread t2 = new Thread(entranceTask,"后门");

        //3.5、2个Thread类的对象分别调用start方法，开启线程
        t1.start();
        t2.start();

    }
}
