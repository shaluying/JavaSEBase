package 集合和泛型03.大作业03.ArrayList集合_迭代器05;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<OrderItem> orderList = new ArrayList<>();
        orderList.add(new OrderItem("键盘", 317.97));
        orderList.add(new OrderItem("漱口水", 157.97));
        orderList.add(new OrderItem("金士顿", 118.95));
        orderList.add(new OrderItem("项圈耳机", 298.97));

        List<OrderItem> orderList01 = new ArrayList<>();
        orderList01.add(new OrderItem("电脑", 9000));
        orderList01.add(new OrderItem("牙刷", 120));
        orderList01.add(new OrderItem("手机", 9000));
        orderList01.add(new OrderItem("空调", 4000.25));

        List<List<OrderItem>> myOrderList = new ArrayList<>();

        myOrderList.add(orderList);
        myOrderList.add(orderList01);


        for (int i = 0; i < myOrderList.size(); i++) {
            for (int j = 0; j < myOrderList.get(i).size(); j++) {
                OrderItem orderItem = myOrderList.get(i).get(j);
                System.out.println("商品编号：" + orderItem.getId() + "商品名称：" + orderItem.getName() + "商品价格：" + orderItem.getPrice());
            }
            System.out.println("-----------------------");
        }

    }
}
