package 多线程09.大作业08.领双色球入会场04;

/*
某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,假设公司有100个员工,利用多线程模拟年会入场过程,并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。
双色球球规则:
双色球: 由6个红色球号码和1个蓝色球号码组成。
红色球: 从1--33中选择。
蓝色球: 从1--16中选择。
红球从小到大的顺序,不可重复,蓝球和红球可以重复
线程运行后打印格式如下：不要求两个入口轮流进，不要求平均分配进入人数
 */

public class Test {
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable();

        Thread thread01 = new Thread(runnable, "前门");
        Thread thread02 = new Thread(runnable, "后门");

        thread01.start();
        thread02.start();
    }


}
