package 程序流程控制01;

public class While循环04 {
    public static void main(String[] args) {
        // while循环
        int i = 0;
        while (i < 3) {
            System.out.println("helloworld");
            i++;
        }
        System.out.println("----------------------");

        // 需求：珠穆朗峰高度是8848860
        // 纸张厚度 0.1
        // 折叠纸张直到不低于珠穆朗峰位置，求折叠几次
        double peakHeight = 8848860;
        double paperThickness = 0.1;
        int count = 0;

        while (paperThickness <= peakHeight) {
            paperThickness *= 2;
            count += 1;
            System.out.println("第" + count + "次折叠后纸张厚度是：" + paperThickness);
        }
        System.out.println("--------------------------------");

        int count01 = 0;
        for (double paperThickness01 = 0.1; paperThickness01 <= peakHeight; ) {
            paperThickness01 *= 2;
            count01 += 1;
            System.out.println("第" + count01 + "次折叠后纸张厚度是：" + paperThickness01);
        }

    }
}
