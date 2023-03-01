package 面向对象中.多态03.大作业07.男人女人类;

/*在Woman类中，包含

- 重写eat()：xx细嚼慢咽吃饭
- 增加 public void makeup()：打印xx化妆
*/

public class Woman extends Person{
    public Woman(String name, int age, String job) {
        super(name, age, job);
    }

    @Override
    public void eat() {
        System.out.println(name+"细嚼慢咽吃饭");
    }

    public void makeup(){
        System.out.println(name+"化妆");
    }

}
