package 方法03;

public class 方法的定义及调用01 {
    public static void main(String[] args) {
        // 甲工人
        int c = add(8, 89);
        System.out.println(c);

        // 乙工人
        System.out.println(add(54, 89));

        println();
    }


    //方法的修饰符 返回值类型 方法名称 形参列表
    // 有参数有返回值的方法
    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }


    // 无参数无返回值的方法
    public static void println() {
        for (int i = 0; i < 3; i++) {
            System.out.println("hello world");
        }
    }
}
