package 面向对象下.接口05.练习08.支付接口;

/*
在测试类中，获取所有支付对象，打印支付对象并调用它们的pay()方法
 */

import java.lang.management.PlatformManagedObject;

public class Test {
    public static void main(String[] args) {
        Payment[] payments = Payment.values();

        for (Payment payment : payments) {
            System.out.println(payment);
            payment.pay();
        }


    }
}
