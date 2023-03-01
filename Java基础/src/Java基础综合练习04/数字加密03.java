package Java基础综合练习04;

import java.util.Scanner;

/**
 * 需求：某系统的数字密码，比如1983，采用加密方式进行传输，规则如下：
 * 先得到每位数，然后每位数都加上5再对10求余，最后将所有数字反转，得到一串新数。
 */
public class 数字加密03 {
    public static void main(String[] args) {
        // 1、定义一个数组存储需要加密的数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要加密的数字个数：");
        int length = sc.nextInt();
        int[] arr = new int[length];

        // 2、录入加密的数据
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数：");
            arr[i] = sc.nextInt();
        }
        printArray(arr);

        // 3、遍历数组中的每个数据，按照规则进行修改
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 4、把数组中的元素进行反转操作。
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换 i 和 j位置处的值，即可反转
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        // 5、输出数组中的数据
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");

        if (arr != null && arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i < arr.length - 1 ? arr[i] + ", " : arr[i]);
            }
        }

        System.out.println("]");
    }

}
