package 数组02;

public class 数组访问02 {
    public static void main(String[] args) {
        // 数组访问
        int[] age = {23, 24, 20};
        int ele01 = age[0];
        double ele02 = age[1];
        System.out.println(ele01 + " " + ele02 + " " + age[2]);
        System.out.println("----------------------------");

        // 赋值
        ele01 = 100;
        ele02 = 101;
        age[2] = 102;
        System.out.println(ele01 + " " + ele02 + " " + age[2]);
        System.out.println(age[0] + " " + age[1] + " " + age[2]);
        System.out.println("----------------------------");

        // 获取数组长度
        System.out.println(age.length);
        System.out.println(age.length - 4);

        /*
        注意
        什么类型的数组只能放什么类型的数据
        数组被定后 长度和类型 都不能再发生改变
         */
    }
}
