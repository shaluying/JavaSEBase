package 集合和泛型03.泛型02.自定义泛型类02;

import java.util.ArrayList;

/*
定义类时同时定义了泛型的类就是泛型类。
泛型类的格式：修饰符 class 类名<泛型变量>{  }

范例：public class MyArrayList<T> {  }

 此处泛型变量T可以随便写为任意标识，常见的如E、T、K、V等。
作用：编译阶段可以指定数据类型，类似于集合的作用。
 */

public class MyArrayList<E> {
    private ArrayList lists = new ArrayList();

    public void add(E e) {
        lists.add(e);
    }

    public void remove(E e) {
        lists.remove(e);
    }

    @Override
    public String toString() {
        return lists.toString();
    }
}
