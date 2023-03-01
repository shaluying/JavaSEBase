package 程序流程控制01;

public class 作业08 {
    public static void main(String[] args) {
        // 打印九九乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        // 小明手中有一张10元纸币。需要到商店兑换零钱,商店只有1元纸币和5角硬币。
        // 那么请列举出所有的兑换方式。打印效果如下：
        //换1元纸币1张，5角硬币18个
        //换1元纸币2张，5角硬币16个
        //换1元纸币3张，5角硬币14个
        //...   ...
        //换1元纸币9张，5角硬币2个
        int money = 10;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j * 0.5 == 10) {
                    System.out.println("换1元纸币" + i + "张，5角硬币" + j + "个");
                }
            }
        }
        System.out.println("---------------------------");

        System.out.println(0.1 + 0.2);
        System.out.println(0.1 + 0.3);
        System.out.println(2 * 0.5);


    }
}
