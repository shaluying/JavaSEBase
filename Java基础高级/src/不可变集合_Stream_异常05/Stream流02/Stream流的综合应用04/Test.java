package 不可变集合_Stream_异常05.Stream流02.Stream流的综合应用04;

/*
需求：某个公司的开发部门，分为开发一部和二部，现在需要进行年中数据结算。
分析：
：员工信息至少包含了(名称、性别、工资、奖金、处罚记录)
：开发一部有4个员工、开发二部有5名员工
：分别筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Topperformer
：分别统计出2个部门的平均月收入，要求去掉最高和最低工资。
：统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。

 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static double allMoney;
    public static double allMoney2;
    public static double allMoneyAll;

    public static void main(String[] args) {
        List<Employee> one = new ArrayList<>();
        one.add(new Employee("猪八戒", '男', 30000, 25000, null));
        one.add(new Employee("孙悟空", '男', 25000, 1000, "顶撞上司"));
        one.add(new Employee("沙僧", '男', 20000, 20000, null));
        one.add(new Employee("小白龙", '男', 20000, 25000, null));

        List<Employee> two = new ArrayList<>();
        two.add(new Employee("武松", '男', 15000, 9000, null));
        two.add(new Employee("李逵", '男', 20000, 10000, null));
        two.add(new Employee("西门庆", '男', 50000, 100000, "被打"));
        two.add(new Employee("潘金莲", '女', 3500, 1000, "被打"));
        two.add(new Employee("武大郎", '女', 20000, 0, "下毒"));

        //筛选出2个部门的最高工资的员工信息，封装成优秀员工对象Topperformer
        Employee goodEmpone = one.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).get();
        Topperformer topperformerOne = new Topperformer(goodEmpone.getName(), goodEmpone.getSalary() + goodEmpone.getBonus());

        Topperformer topperformerTwo = two.stream().max((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).map(e1 -> new Topperformer(e1.getName(), e1.getBonus() + e1.getSalary())).get();


        //分别统计出2个部门的平均月收入，要求去掉最高和最低工资。
        one.stream().sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).skip(1).limit(one.size() - 2).forEach(e -> {
            allMoney += e.getBonus() + e.getSalary();
        });
        System.out.println("开发一部的平均工资是：" + allMoney / (one.size() - 2));

        two.stream().sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).skip(1).limit(one.size() - 2).forEach(e -> {
            allMoney2 += e.getBonus() + e.getSalary();
        });
        System.out.println("开发二部的平均工资是：" + allMoney2 / (one.size() - 2));


        //统计2个开发部门整体的平均工资，去掉最低和最高工资的平均值。
        //合并2个集合流，再统计
        Stream<Employee> oneStream = one.stream();
        Stream<Employee> twoStream = two.stream();
        Stream<Employee> oneAndTwoStream = Stream.concat(oneStream, twoStream);

        oneAndTwoStream.sorted((o1, o2) -> Double.compare(o1.getSalary() + o1.getBonus(), o2.getSalary() + o2.getBonus())).limit(one.size() + two.size() - 1).skip(1).forEach(e -> {
            allMoneyAll += e.getBonus() + e.getSalary();
        });

        BigDecimal a = BigDecimal.valueOf(allMoneyAll);
        BigDecimal b = BigDecimal.valueOf(one.size() + two.size() - 2);
        System.out.println("开发部的平均工资是：" + a.divide(b, 2, RoundingMode.HALF_UP));

    }
}
