package 面向对象下.接口05.练习08.exer5;

public class Ball implements Rollable{
    private String name;

    public String getName() {
        return name;
    }

    public Ball(String name) {
        this.name = name;
    }

    @Override
    public void play() {
//        ball = new Ball("Football");
        //ball是final的，不能被重新赋值
        System.out.println(ball.getName());
    }
}
