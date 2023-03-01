package 集合和泛型03.大作业03.BigDecimal02;

/*
我们使用转账的时候,输入金额之后小数点后面只能输入到2位,而在程序内部,
实际上是把输入的元,转成了分去操作了,当我们转成功之后,会再把分变成元来展示给用户们,
请设计程序,完成所描述的需求
   提示:直接将元转成分,再将分转成元(至于软件内部怎么操作分的,我们无需关心)
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入转账金额：");
        String transferAmount = sc.next();

        double accAmount = yuanToFen(transferAmount);

        System.out.println("转账成功！转账金额：" + accAmount);


    }

    public static double yuanToFen(String money) {
        //创建BigDecimal对象
        BigDecimal oriMoney = new BigDecimal(money);
        BigDecimal oneHundred = BigDecimal.valueOf(100);
        //将要转账的金额乘以100,变成分的单位
        BigDecimal calAmount = oriMoney.multiply(oneHundred);
        //将分单位的金额除以100变成元,并且保留2位小数,展示给用户
        BigDecimal accAmount = calAmount.divide(oneHundred, 2, RoundingMode.HALF_UP);
        return accAmount.doubleValue();
    }
}
