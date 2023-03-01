package 面向对象下.内部类06.匿名内部类05.练习03;

public class Computer {
    public void start(){
        System.out.println("开机");
    }

    public void close(){
        System.out.println("关机");
    }

    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}
