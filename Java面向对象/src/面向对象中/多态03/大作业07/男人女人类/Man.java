package 面向对象中.多态03.大作业07.男人女人类;

/*在Man类中，包含

- 重写eat()：xx狼吞虎咽吃饭
- 增加  public void smoke()：打印xx抽烟
*/

public class Man extends Person {
    public Man(String name, int age, String job) {
        super(name, age, job);
    }

    @Override
    public void eat() {
        System.out.println(name+"狼吞虎咽吃饭");;
    }

    public void smoke(){
        System.out.println(name+"抽烟");
    }

}
