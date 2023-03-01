package 面向对象中.多态03.多态引入及现象01;

public class Person {
/*    private Dog dog;
    private Cat cat;
//问题是：无法确定这个人的宠物具体是哪种，后期也不方便扩展*/

    //    private Pet pet;//只是一个宠物
    private Pet[] pets = new Pet[5];//可以养很多宠物
    private int total;

    public void adopt(Pet pet) {//形参是Pet类型，是Dog、Cat等类型的父类
//        this.pet = pet;
        pets[total++] = pet;
    }

    public void feed() {
//        pet.eat();
        for (int i = 0; i < total; i++) {
            pets[i].eat();  // 调父执行子
        }
    }
}
