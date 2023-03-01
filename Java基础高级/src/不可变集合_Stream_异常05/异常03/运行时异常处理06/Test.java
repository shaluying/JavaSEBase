package 不可变集合_Stream_异常05.异常03.运行时异常处理06;

/**
    目标：运行时异常的处理机制。

    可以不处理，编译阶段又不报错。
    按照理论规则：建议还是处理，只需要在最外层捕获处理即可
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("程序开始。。。。。。。。。。");
        try {
            chu(10, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束。。。。。。。。。。");
    }

    public static void chu(int a , int b) { // throws RuntimeException{
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
