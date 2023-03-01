package 多线程09.大作业08.抄单词02.teacher;
/*
    第二题
        小明上课时打瞌睡,被老师发现,老师惩罚他抄写100遍单词"HelloWorld",而且老师每发现一个同学,
        惩罚的次数和抄写的内容都不一样。恰好今天学习多线程,
        于是乎小明就找到了小王帮助他一起抄写单词请使用多线程模拟小明抄单词的任务

    实现步骤:
        1、定义惩罚Punishment类
        1.1、 定义int类型成员变量leftCount，代表抄写次数
        1.2、 定义String类型成员变量copyWord,代表抄写内容
        1.3、 定义构造方法，给初始化抄写次数和抄写内容
        1.4、 定义set和get方法
        2、定义线程任务类CopyRunnable,实现Runnable接口
        2.1、定义Punishment类型成员变量punishment
        2.2、定义构造方法，给成员变量punishment赋值
        2.3、覆盖重写run方法（使用同步方法或同步代码块保证数据安全），按照打印要求实现功能
        3、定义测试类Test02
        3.1、创建惩罚类Punishment的对象,初始化抄写次数为100,抄写内容为HelloWorld
        3.2、创建线程任务CopyRunnable类的对象，传递惩罚类Punishment的对象
        3.3、创建2个Thread类的对象，传递线程任务CopyRunnable类的对象并指定线程名称
        3.4、2个Thread类的对象分别调用start方法，开启线程
 */
public class Test02 {
    public static void main(String[] args) {
        //3.1、创建惩罚类Punishment的对象,初始化抄写次数为100,抄写内容为HelloWorld
        Punishment punishment = new Punishment(100,"HelloWorld");

        //3.2、创建线程任务CopyRunnable类的对象，传递惩罚类Punishment的对象
        CopyRunnable copyRunnable = new CopyRunnable(punishment);

        //3.3、创建2个Thread类的对象，传递线程任务CopyRunnable类的对象并指定线程名称
        Thread t1 = new Thread(copyRunnable,"小明");
        Thread t2 = new Thread(copyRunnable,"小王");

        //3.4、2个Thread类的对象分别调用start方法，开启线程
        t1.start();
        t2.start();
    }
}
