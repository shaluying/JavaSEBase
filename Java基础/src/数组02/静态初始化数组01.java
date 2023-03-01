package 数组02;

public class 静态初始化数组01 {
    public static void main(String[] args) {
        // 静态初始化数组
        // 目标：学会使用静态初始化的方式定义数组
        // 数据类型[] 数组名称 = new 数据类型[]{元素1,元素2,...}

        // 完整写法
        double[] score = new double[]{36.2, 35.6, 89.2, 100.0};
        int[] age = new int[]{8, 45, 63, 12, 89, 20};
        String[] name = new String[]{"赵京", "秦名谦", "林灵"};

        // 简化写法
        double[] score01 = {36.2, 35.6, 89.2, 100.0};
        int[] age01 = {8, 45, 63, 12, 89, 20};
        String[] name01 = {"赵京", "秦名谦", "林灵"};

        System.out.println(score); // 存的是数组的内存地址


    }
}
