package 多线程09.大作业08.抄单词02;

public class Task {
    private int count;

    public Task() {
    }

    public Task(int count) {
        this.count = count;
    }

    public synchronized void runTask() {
            this.count -= 1;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
