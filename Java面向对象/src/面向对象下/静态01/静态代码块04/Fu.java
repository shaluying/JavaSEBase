package 面向对象下.静态01.静态代码块04;

public class Fu {
    public Fu() {
        System.out.println("无参构造");
    }

    {
        System.out.println("Fu类的非静态代码块");
    }

    static {
        System.out.println("Fu静态代码块1，a = " + Fu.a);
    }

    private static int a = 1;

    static {
        System.out.println("Fu静态代码块2，a = " + a);
    }

    public static void method() {
        System.out.println("Fu.method");
    }

}
