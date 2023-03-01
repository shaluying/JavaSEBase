package 多线程09.大作业08.抽奖03.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
    第三题
        某房产公司大促销,所有购房者可以参加一次抽奖,抽奖箱中总共有10个奖品,
        分别是:"苹果手机","华为手机","三洋踏板摩托","迪拜7日游","苹果笔记本",
        "联想笔记本","小米空气净化器","格力空调","海尔冰箱","海信电视"
        所有抽奖者分成两组进行抽奖,请创建两个线程,名称分别为“第一组”和“第二组”，随机从抽奖箱中完成抽奖

    实现步骤:
        1、定义线程任务类CJTask,实现Runnable接口
        1.1、 定义List类型成员变量prizeList，代表抽奖池
        1.2、 定义构造方法，初始化抽奖池
        1.3、 覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能（死循环内部嵌套 同步）1.3.1、 没有奖品，结束循环
        1.3.2、有奖品，从抽奖池中随机抽取一个（注意：抽一个奖品，抽奖池中就少一个）
        1.3.3、打印输出
        2、定义测试类Test03
        2.1、创建List集合对象prizeList代表抽奖池
        2.2、向List集合对象prizeList中添加所有的奖项
        2.2、创建线程任务CJTask类的对象，传递抽奖池List集合对象prizeList
        2.3、创建2个Thread类的对象，传递线程任务CJTask类的对象并指定线程名称
        2.4、2个Thread类的对象分别调用start方法，开启线程
 */
public class Test03 {
    public static void main(String[] args) {
        //2.1、创建List集合对象prizeList代表抽奖池
        List<String> prizeList = new ArrayList<>();

        //2.2、向List集合对象prizeList中添加所有的奖项
        Collections.addAll(prizeList,"苹果手机","华为手机","三洋踏板摩托","迪拜7日游","苹果笔记本",
                "联想笔记本","小米空气净化器","格力空调","海尔冰箱","海信电视");

        //2.2、创建线程任务CJTask类的对象，传递抽奖池List集合对象prizeList
        CJTask cjTask = new CJTask(prizeList);

        //2.3、创建2个Thread类的对象，传递线程任务CJTask类的对象并指定线程名称
        Thread t1 = new Thread(cjTask,"第一组");
        Thread t2 = new Thread(cjTask,"第二组");

        //2.4、2个Thread类的对象分别调用start方法，开启线程
        t1.start();
        t2.start();
    }
}
