package day0114_06teacher_code;

/*
类的定义：
    一类具有相同特性的事物的抽象描述。和现实世界中对事物的分类是一样的。
    咨询老师、宋红康老师、Tony老师、苍老师....
    共同特点：
        属性：姓名、年龄、性别...
        方法：提供技术服务

    电脑：
        属性：型号、大小、价格、....
        方法：看视频、玩游戏、写代码...

对象的定义：
    一类事物的一个具体的实实在在的个体。
    老师是代表一类事物，宋老师只是一个具体的个体。

    类是很多对象共同特征的描述的提取
    对象是通过类的“模板”创建出来的一个实例。

    写代码的角度：先有类，再有对象，没有类就无法new对象。
    从设计的角度：综合了很对对象的共同特征才设计出一个类。

 */
public class Test10Class {
    public static void main(String[] args) {
        //根据类创建对象
        Teacher t1 = new Teacher();
        //为t1对象的属性赋值，还是为变量赋值
        t1.name = "宋红康";
        t1.age = 35;
        t1.gender = '男';

        //调用t1对象的方法，它会执行一段代码
        t1.eat();

        Teacher t2 = new Teacher();
        //为t2对象的属性赋值，还是为变量赋值
        t2.name = "柴林燕";
        t2.age = 28;
        t2.gender = '女';

        t2.eat();
    }
}