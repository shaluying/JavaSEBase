package 数组02;

public class 作业09 {
    public static void main(String[] args) {
        //定义一个数组其中包含多个数字。
        // 用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。
        // （可以创建其他数组，不必须在原数组中改变）
        int[] arr = {6, 89, 45, 12, 23, 25, 6, 8, 9, 9, 74, 102, 9};
        int[] brr = new int[arr.length];
        int index01 = 0, index02 = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            int re = arr[i] % 2;
            switch (re) {
                case 0:
                    brr[index02] = arr[i];
                    index02--;
                    break;
                case 1:
                    brr[index01] = arr[i];
                    index01++;
                    break;
            }
        }

        for (int i = 0; i < brr.length; i++) {
            System.out.print(brr[i] + " ");
        }

    }
}
