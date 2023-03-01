package 面向对象上.练习03;

public class Test02 {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.setName("张三");
        e.setBirthday(1996, 5, 23);
        System.out.println(e.getInfo());

    }
}
