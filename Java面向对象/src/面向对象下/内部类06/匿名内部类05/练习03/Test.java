package 面向对象下.内部类06.匿名内部类05.练习03;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.useUSB(new USB() {
            @Override
            public void open() {
                System.out.println("鼠标开启");
            }

            @Override
            public void close() {
                System.out.println("鼠标关闭");
            }
        });


        computer.useUSB(new USB() {
            @Override
            public void open() {
                System.out.println("键盘开启");
            }

            @Override
            public void close() {
                System.out.println("键盘关闭");
            }
        });


    }
}
