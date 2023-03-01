package 单元测试_反射_注解_动态代理11.反射02.练习08.test03.teacher;

//2、定义FlyAble接口实现类Bird,重写抽象方法fly
public class Bird  implements FlyAble{
    @Override
    public void fly() {
        System.out.println("鸟儿在飞....");
    }
}