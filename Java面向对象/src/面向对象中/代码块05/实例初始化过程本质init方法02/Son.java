package 面向对象中.代码块05.实例初始化过程本质init方法02;

public class Son extends Father {
    private int c = 1;
    {
        System.out.println("Son类的非静态代码块,c = " + c);
    }
    public Son() {
//        super();//隐藏的
        System.out.println("Son类的无参构造");
    }

    public Son(int a, int b, int c) {
        super(a, b);
        this.c = c;
        System.out.println("Son类的有参构造");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ",c = " + c;
    }
}
