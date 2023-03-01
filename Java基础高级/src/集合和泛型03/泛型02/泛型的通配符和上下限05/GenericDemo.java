package 集合和泛型03.泛型02.泛型的通配符和上下限05;

import java.util.ArrayList;

/*
    目标：泛型通配符。?

    需求：开发一个极品飞车的游戏，所有的汽车都能一起参与比赛。

    注意：
        虽然BMW和BENZ都继承了Car
        但是ArrayList<BMW>和ArrayList<BENZ>与ArrayList<Car>没有关系的！!
    通配符：？
        ？可以在“使用泛型”的时候代表一切类型。
        E T K V 是在定义泛型的时候使用的。
    泛型的上下限：
        ？ extends Car : ?必须是Car或者其子类  泛型上限
        ? super Car ：？必须是Car或者其父类   泛型下限
    小结：
        通配符：？
        ？可以在“使用泛型”的时候代表一切类型。

 */

public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<BENZ> benzs = new ArrayList<>();
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        benzs.add(new BENZ());
        go(benzs);

        ArrayList<BMW> bmws = new ArrayList<>();
        bmws.add(new BMW());
        bmws.add(new BMW());
        bmws.add(new BMW());
        go(bmws);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
//        go(dogs);


    }

    public static void go(ArrayList<? extends Car> cars) {

    }

//    public static <Car是发送到发> void go(ArrayList<Car是发送到发> cars) {
//
//    }
}

class Dog {

}

class BENZ extends Car {

}

class BMW extends Car {

}


class Car {
}
