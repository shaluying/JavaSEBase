package 面向对象中.继承02.子类调用父类成员及重写02;

public class Phone {
    protected String name;
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void sendMessage() {
        System.out.println("发短信");
    }

    public void call() {
        System.out.println("打电话");
    }

    public void showNumber() {
        System.out.println("显示来电号码");
    }

    protected Phone getOwner() {
        return new Phone();//具体功能省略了
    }
}

