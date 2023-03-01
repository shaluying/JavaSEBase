package 面向对象下.枚举02.枚举练习03.设备状态枚举类;

import static 面向对象下.枚举02.枚举练习03.设备状态枚举类.Data.*;

/*
在测试类中，创建Equipment类型的数组，
并使用Data类的二维数组EQUIPMENTS的信息初始化设备对象，遍历输出
*/

public class Test {
    public static void main(String[] args) {
        Equipment[] equipment = new Equipment[EQUIPMENTS.length];

        for (int i = 0; i < equipment.length; i++) {
            int id = Integer.parseInt(EQUIPMENTS[i][0]);
            String name = EQUIPMENTS[i][1];
            double price = Double.parseDouble(EQUIPMENTS[i][2]);
            String brand = EQUIPMENTS[i][3];
            Status status = Status.getByValue(Integer.parseInt(EQUIPMENTS[i][4]));

            equipment[i] = new Equipment(id, brand, price, name, status);

            System.out.println(equipment[i]);


        }

    }
}
