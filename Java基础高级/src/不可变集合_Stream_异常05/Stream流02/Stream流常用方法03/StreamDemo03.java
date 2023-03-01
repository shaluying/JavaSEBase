package 不可变集合_Stream_异常05.Stream流02.Stream流常用方法03;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
     目标：Stream流的常用API
         forEach : 逐一处理(遍历)
         count：统计个数
            -- long count();
         filter : 过滤元素
            -- Stream<T> filter(Predicate<? super T> predicate)
         limit : 取前几个元素
         skip : 跳过前几个
         map : 加工方法
         concat : 合并流。
         Stream<T> distinct​()
            去除流中重复的元素。依赖(hashCode和equals方法)

 */
public class StreamDemo03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        //filter : 过滤元素
        // Stream<T> filter(Predicate<? super T> predicate)
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));
        System.out.println();

        //count：统计个数
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);
        System.out.println();

        //limit : 取前几个元素
        // list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println);
        System.out.println();

        //skip : 跳过前几个
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println);
        System.out.println();

        // map加工方法: 第一个参数原材料  -> 第二个参数是加工后的结果。
        // 给集合元素的前面都加上一个：黑马的：
        /*
        list.stream().map(new Function<String, String>() {
            @Override // map底层将遍历到的每个元素送给Function类型对象的apply方法
            // 用以后续添加操作
            public String apply(String s) {
                return "黑马的：" + s;
            }
        }).forEach(s -> System.out.println(s));
        */
        list.stream().map(s -> "黑马的：" + s).forEach(a -> System.out.println(a));
        System.out.println();

        // 需求：把所有的名称 都加工成一个学生对象。
        list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
//        list.stream().map(Student::new).forEach(System.out::println); // 构造器引用  方法引用
        System.out.println();

        // 合并流。
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("java1", "java2");
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> s3 = Stream.concat(s1, s2);
        s3.distinct().forEach(s -> System.out.println(s));
    }
}
