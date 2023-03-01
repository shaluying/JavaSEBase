package 方法03;

import java.util.Random;

public class 作业07 {
    public static void main(String[] args) {
        // 题目7 请定义一个方法，对正数的小数进行四舍五入的操作(不考虑负数情况)。
        // 四舍五入之后的结果是一个int整数类型并返回。最后对方法进行测试。
        System.out.println(rounding(5.3));
        System.out.println(rounding(5.8));
        System.out.println("------------------------------");

        int[] redEnvelopes = {2, 588, 888, 1000, 10000};
        randomPrint_IntArrayContent(redEnvelopes);

        // 题目8 一个大V直播抽奖，奖品是现金红包，
        // 分别有{2,588,888,1000,10000}五个奖金。
        // 请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        // 打印效果如下：（随机顺序，不一定是下面的顺序）
        /*
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出
        */

    }

    // 题目7
    public static int rounding(double num) {
        if (num - (int) num >= 0.5) {
            return (int) num + 1;
        }
        return (int) num;
    }

    // 题目8
    public static void randomPrint_IntArrayContent(int[] arr) {
        int[] temp = new int[arr.length];
        Random r = new Random();
        for (int i = 0; i < temp.length; i++) {
            boolean result = true;
            // 将随机索引添加到temp数组中去
            while (true) {
                int tempNum = r.nextInt(temp.length )+ 1;

                for (int j = 0; j < temp.length; j++) {
                    if (temp[j] == tempNum) {
                        result = false;
                        break;
                    } else {
                        result = true;
                    }
                }

                if (result) {
                    temp[i] = tempNum;
                    break;
                }
            }

        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(arr[temp[i] - 1] + "元的奖金被抽出");
        }
    }

}
