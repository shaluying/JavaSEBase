package XML_XML解析_XPath_设计模式等12.设计模式04.工厂模式01;


/*
    目标：工厂模式。

    什么是工厂设计模式？
            工厂模式（Factory Pattern）是 Java 中最常用的设计模式之一。
            这种类型的设计模式属于创建型模式，它提供了一种创建对象的方式。
            之前我们创建类对象时, 都是使用new 对象的形式创建, 除new 对象方式以外,
            工厂模式也可以创建对象。

    工厂设计模式的作用：
            1.对象通过工厂的方法创建返回，工厂的方法可以为该对象进行加工和数据注入。
            2.可以实现类与类之间的解耦操作（核心思想，重点）

    小结：
        工厂模式的思想是提供一个工厂方法返回对象！
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Computer c1 = FactoryPattern.createComputer("huawei");
        c1.start();

        Computer c2 = FactoryPattern.createComputer("mac");
        c2.start();
    }
}













