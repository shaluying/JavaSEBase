package 方法03;

/*
只要是同一个类中，方法名称相同、形参列表不同，那么他们就是重载的方法，其他都不管！
（如：修饰符，返回值类型都无所谓）
 */

public class 方法重载06 {
    public static void main(String[] args) {
        // 目标：识别方法重载的形式。
        // 并理解其调用流程，最后需要知道使用方法重载的好处。
        fire();
        fire("岛国");
        fire("米国", 1000);

    }


    public static void fire() {
//        System.out.println("发射1枚导弹给米国");
        fire("米国");
    }

    public static void fire(String location) {
//        System.out.println("发射1枚导弹给" + location);
        fire(location, 1);
    }

    public static void fire(String location, int number) {
        System.out.println("发射" + number + "枚导弹给" + location);
    }

    // 方法重载注意事项
    // 新方法
    public static void open() {
    }

    // 重载方法
    public static void open(int a) {
    }

    // 重载方法
    static void open(int a, int b) {
    }

    // 重载方法
    public static void open(double a, int b) {
    }

    // 重载方法
    public static void open(int a, double b) {
    }

    // 重复方法
    // public void open(int i, double d) { }

    // 新方法
    public static void OPEN() {
    }
}
