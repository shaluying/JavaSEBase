package 多线程09.大作业08.抄单词02.teacher;
/*
    1、定义惩罚Punishment类
        1.1、 定义int类型成员变量leftCount，代表抄写次数
        1.2、 定义String类型成员变量copyWord,代表抄写内容
        1.3、 定义构造方法，给初始化抄写次数和抄写内容
        1.4、 定义set和get方法
 */
public class Punishment {
    //1.1、 定义int类型成员变量leftCount，代表抄写次数
    private int leftCount;

    //1.2、 定义String类型成员变量copyWord,代表抄写内容
    private String copyWord;

    //1.3、 定义构造方法，给初始化抄写次数和抄写内容
    public Punishment(int leftCount, String copyWord) {
        this.leftCount = leftCount;
        this.copyWord = copyWord;
    }

    //1.4、 定义set和get方法
    public int getLeftCount() {
        return leftCount;
    }

    public void setLeftCount(int leftCount) {
        this.leftCount = leftCount;
    }

    public String getCopyWord() {
        return copyWord;
    }

    public void setCopyWord(String copyWord) {
        this.copyWord = copyWord;
    }
}
