package 多线程09.大作业08.抄单词02;

/*
小明上课时打瞌睡,被老师发现,老师惩罚他抄写100遍单词"HelloWorld",
恰好今天学习多线程,于是乎小明就找到了小王帮助他一起抄写单词。
请使用多线程模拟小明和小王一起完成抄单词的惩罚。
不要求轮流写，不要求平均分配抄写次数
 */

public class Test {
    public static void main(String[] args) {

        Task task = new Task(100);

        new MyThread(task, "小明").start();
        new MyThread(task, "小王").start();

    }
}
