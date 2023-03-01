package 面向对象下.内部类06.单链表思考内存图;


public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinked list = new SingleLinked();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add(1);
        list.add(5.0);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
