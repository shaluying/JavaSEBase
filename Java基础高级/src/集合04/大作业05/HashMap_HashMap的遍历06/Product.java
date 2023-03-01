package 集合04.大作业05.HashMap_HashMap的遍历06;

/*
定义一个商品类,包括两个属性:store(店铺名称),name(商品名称),
提供对应的构造以及get/set方法,还有重写hashCode和equals方法
 */

import java.util.Objects;

public class Product {
    private  String store;
    private  String name;

    public Product() {
    }

    public Product(String store, String name) {
        this.store = store;
        this.name = name;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(store, product.store) &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "store='" + store + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
