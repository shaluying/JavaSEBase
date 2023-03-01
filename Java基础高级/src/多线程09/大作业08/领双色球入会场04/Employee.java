package 多线程09.大作业08.领双色球入会场04;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Employee {
    private int id;
    private final int[] dualColorList = setDualColorList();

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    private int[] setDualColorList() {
        Random r = new Random();
        int[] luckNumber = new int[7];

        // 生成红色球号码
        for (int i = 0; i < luckNumber.length - 1; i++) {
            while (true) {
                int num = r.nextInt(33) + 1;
                if (!isExist(num, luckNumber)) {
                    luckNumber[i] = num;
                    break;
                }
            }
        }

        // 生成蓝色球号码
        luckNumber[6] = r.nextInt(16) + 1;
        return luckNumber;
    }

    private static boolean isExist(int num, int[] arr) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] getDualColorList() {
        return dualColorList;
    }
}
