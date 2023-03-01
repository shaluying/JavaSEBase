package 数组02;

public class 动态初始化数组03 {
    public static void main(String[] args) {
        // 动态初始化数组
        // 先定义一个确定长度和类型的空数组 之后再给数组赋值
        int[] arr = new int[3]; // 定义一个确定长度和类型的空数组
        arr[1] = 20;  // 给数组赋值
        System.out.print(arr[0] + "\t");  // 默认值为0
        System.out.println(arr[1]);

        double[] score = new double[6];
        System.out.println(score[0]);  // 默认值为0.0

        char[] chars = new char[6];
        System.out.println(chars[0]);
        System.out.println((int) chars[0]);  // 默认值对应的编码为0

        boolean[] booleans = new boolean[3];
        System.out.println(booleans[0]);  // 默认值为false

        String[] strings = new String[3];
        System.out.println(strings[0]);  // 默认值为null

    }
}
