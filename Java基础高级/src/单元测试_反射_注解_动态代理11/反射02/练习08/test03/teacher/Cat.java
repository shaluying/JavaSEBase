package 单元测试_反射_注解_动态代理11.反射02.练习08.test03.teacher;

//4、定义JumpAble接口实现类Cat,重写抽象方法jump
public class Cat implements JumpAble {
    @Override
    public void jump() {
        System.out.println("猫儿在跳...");
    }
}