package 方法03;

public class 方法练习03 {
    public static void main(String[] args) {
        int[] faceScore = {15, 9000, 10000, 20000, 9500, -5};
        System.out.println("faceScore中最大值是：" + getMax(faceScore));

    }


    // 求数组中最值的方法
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}
