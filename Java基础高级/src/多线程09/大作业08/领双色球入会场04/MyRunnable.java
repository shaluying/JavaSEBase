package 多线程09.大作业08.领双色球入会场04;

import java.util.Arrays;

public class MyRunnable implements Runnable {
    private int count = 1;


    public MyRunnable() {
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        String name = thread.getName();
        int cou = 0;
        while (true) {
            synchronized (this) {
                if (count > 100) {
                    break;
                }

                Employee employee = new Employee(count);
                System.out.println("编号为" + count + "的员工从" + name + "入场！拿到的双色球号码是：" + Arrays.toString(employee.getDualColorList()));
                count++;
                cou++;
            }
        }
        System.out.println("从" + name + "进入的员工总数：" + cou);
    }


}
