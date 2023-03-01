package 程序流程控制01;

public class For循环03 {
    public static void main(String[] args) {
        // 目标：学会使用for循环，并理解它的执行流程。
        // 需求：输出3次HelloWorld
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("------------------------");

        for (int i = 1; i <= 5; i += 2) {
            System.out.println("HelloWorld");
        }

        // 需求：计算1-5的和
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("1-5累加和是：" + sum);
        System.out.println("--------------------");

        // 需求：求1-10的奇数和
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("1-10奇数累加和是：" + sum);
        System.out.println("----------------------------");
        sum = 0;
        for (int i = 1; i <= 10; i += 2) {
            sum += i;
        }
        System.out.println("1-10奇数累加和是：" + sum);
        System.out.println("-------------------------");

        // 需求：找出水仙花数并输出
        // 水仙花数是一个三位数，并且个位 十位 百位的数字立方和等于原数
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.print(i + "\t"); // 去掉ln后print打印不换行
                count++;             // "\t"是打印后加一个空格
            }
        }
        System.out.println();  // 用作换行
        System.out.println("水仙花数的个数是：" + count);

    }
}