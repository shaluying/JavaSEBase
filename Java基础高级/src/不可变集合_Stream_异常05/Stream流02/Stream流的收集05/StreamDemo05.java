package 不可变集合_Stream_异常05.Stream流02.Stream流的收集05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
     目标：收集Stream流的数据到 集合或者数组中去。

     收集Stream流的作用 ？
    Stream流是操作集合/数组的手段
    操作的结果数据最终要恢复到集合或者数组中去。

 */
public class StreamDemo05 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
        list.add("张三丰");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList()); // 可变集合
        zhangList.add("java1");
        System.out.println(zhangList);
        System.out.println();

//       List<String> list1 = s1.toList(); // 得到不可变集合
//       list1.add("java"); // 会报错
//       System.out.println(list1);

        // 注意注意注意：“流只能使用一次！！！”
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);
        System.out.println();

        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
//         Object[] arrs = s3.toArray();

//        String[] arrs = s3.toArray(new IntFunction<String[]>() {
//            @Override // toArray底层将获得到流的总长度传给i
//            public String[] apply(int i) {
//                return new String[i];
//            }
//        });
        String[] arrs = s3.toArray(i -> new String[i]);

//        String[] arrs = s3.toArray(String[]::new); // 可以不管，拓展一下思维！！
        System.out.println("数组内容：" + Arrays.toString(arrs));

    }
}
