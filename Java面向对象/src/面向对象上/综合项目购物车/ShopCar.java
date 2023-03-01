package 面向对象上.综合项目购物车;

import java.util.Scanner;

public class ShopCar {

    public int id = 1001;

    public static void main(String[] args) {

        // 定义 商品类型数组 存储 商品类型对象
        Article[] shopCar = new Article[100];
        ShopCar id = new ShopCar();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择以下功能：");
            System.out.println("添加商品：add");
            System.out.println("查看商品：query");
            System.out.println("修改数量：update");
            System.out.println("结算价格：pay");
            String commond = sc.next();
            switch (commond) {
                case "add":  //添加商品
                    id.add(shopCar, sc);
                    break;
                case "query":  //查看商品
                    query(shopCar);
                    break;
                case "update":  //修改数量
                    update(shopCar, sc);
                    break;
                case "pay":  //结算价格
                    pay(shopCar);
                    break;
                default:
                    System.out.println("功能错误");
            }
        }

    }

    private static void update(Article[] shopCar, Scanner sc) {

        System.out.println("请输入想要修改商品的编号：");
        int inputId = sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                System.out.println("没有该编号的商品！");
                return;
            }
            if (shopCar[i].id == inputId) {
                System.out.println("请输入新的购买数量：");
                shopCar[i].buyNumber = sc.nextInt();
                System.out.println("修改成功！");
                return;
            }
        }
    }


    public static void pay(Article[] shopCar) {
        double sumPrice = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                sumPrice += shopCar[i].price * shopCar[i].buyNumber;
            } else {
                break;
            }
        }
        System.out.println("总价格是：" + sumPrice);
    }

    public static void query(Article[] shopCar) {
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                shopCar[i].printSelfInfo();
            } else {
                return;
            }
        }
    }

    public void add(Article[] shopCar, Scanner sc) {
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = new Article();
                shopCar[i].id = id++;
                System.out.println("请输入商品名称：");
                shopCar[i].name = sc.next();
                System.out.println("请输入商品价格：");
                shopCar[i].price = sc.nextDouble();
                System.out.println("请输入商品数量：");
                shopCar[i].buyNumber = sc.nextInt();
                System.out.println("商品添加成功！");
                break;
            }
        }
    }
}
