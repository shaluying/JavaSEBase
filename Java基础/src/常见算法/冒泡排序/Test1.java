package 常见算法.冒泡排序;

import java.util.Arrays;

/**
 * 目标：学会使用冒泡排序的方法对数组进行排序。
 */
public class Test1 {
    public static void main(String[] args) {
        // 1、定义数组
        int[] arr = {5, 1, 3, 2};
        //           0  1  2  3

        // 2、定义一个循环控制冒泡比较几轮： arr.length - 1
        for (int i = 1; i < arr.length; i++) {
            // i = 1     比较3次 arr.length-i
            // i = 2     比较2次
            // i = 3     比较1次
            // 3、定义内部循环，控制比较几次
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
