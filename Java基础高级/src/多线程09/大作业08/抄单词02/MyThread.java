package 多线程09.大作业08.抄单词02;

public class MyThread extends Thread {
    private Task task;

    public MyThread() {
    }

    public MyThread(Task task, String name) {
        super(name);
        this.task = task;
    }

    @Override
    public void run() {
        int cou = 0;
        while (true) {
            synchronized (task) {
                if (task.getCount() > 0) {
                    task.runTask();
                    cou++;
                    System.out.println(Thread.currentThread().getName() + "抄写一遍" + "两人总共还要抄" + task.getCount() + "遍");
                } else {
                    break;
                }
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "抄了" + cou + "遍");
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }


}
