package 方法03;

public class 方法内存原理及参数传递机制04 {
    public static void main(String[] args) {
        // 目标：理解Java的基本类型的参数传递：值传递。
        int a = 10;
        change(a);
        System.out.println(a); // 10

        // 目标：理解引用类型的参数传递机制：值传递，区分其不同点
        int[] arrs = {10, 20, 30};
        change01(arrs);
        System.out.println(arrs[1]); // 222
    }


    public static void change(int a) {
        System.out.println(a); // 10
        a = 20;
        System.out.println(a); // 20
    }


    public static void change01(int[] arrs) {
        System.out.println(arrs[1]); // 20
        arrs[1] = 222;
        System.out.println(arrs[1]); // 222
    }
}
