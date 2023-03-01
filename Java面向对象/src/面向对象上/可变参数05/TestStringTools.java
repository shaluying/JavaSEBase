package 面向对象上.可变参数05;

public class TestStringTools {
    public static void main(String[] args) {
        StringTools tools = new StringTools();

        System.out.println(tools.concat('#'));
        System.out.println(tools.concat('#', "hello", "wrold", "功底"));
    }
}

