package 集合和泛型03.泛型02.自定义泛型接口04;

public interface Data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
