package 多线程09.大作业08.抽奖03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
某房产公司大促销,所有购房者可以参加一次抽奖,抽奖箱中总共有10个奖品,
分别是:"苹果手机","华为手机","三洋踏板摩托","迪拜7日游","苹果笔记本",
"联想笔记本","小米空气净化器","格力空调","海尔冰箱","海信电视"
所有抽奖者分成两组进行抽奖,请创建两个线程,名称分别为“第一组”和“第二组”，随机从抽奖箱中完成抽奖
程序运行效果如下图：不要求轮流写，不要求平均分配抽奖次数
 */

public class Test {
    public static void main(String[] args) {
        List<String> goodsList = new ArrayList<>();

        Collections.addAll(goodsList, "苹果手机", "华为手机", "三洋踏板摩托", "迪拜7日游", "苹果笔记本",
                "联想笔记本", "小米空气净化器", "格力空调", "海尔冰箱", "海信电视");

        Runnable runnable = new DrawRunnable(goodsList);

        Thread thread01 = new Thread(runnable, "第一组");
        Thread thread02 = new Thread(runnable, "第二组");

        thread01.start();
        thread02.start();

    }
}
