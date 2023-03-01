package 面向对象下.接口05.练习08.支付接口;

/*
声明支付枚举类Payment：
- 声明String类型的final属性description
- 声明有参构造Payment(String description)
- 重写toString方法，返回description
```
ALIPAY("支付宝"),WECHAT("微信"),CREDITCARD("信用卡"),DEPOSITCARD("储蓄卡")
```
- 枚举类Payment实现接口Payable
​	①支付宝/微信：对接口的实现是打印“扫码支付”
​	②信用卡/储蓄卡：对接口的实现是打印“输入卡号支付”
 */

public enum Payment implements Payable {
    ALIPAY("支付宝"),
    WECHAT("微信"),
    CREDITCARD("信用卡"),
    DEPOSITCARD("储蓄卡");
    private final String description;


    Payment(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "description='" + description + '\'' +
                '}';
    }

    @Override
    public void pay() {
        switch (this) {
            case ALIPAY:
            case WECHAT:
                System.out.println("扫码支付");
                break;
            case CREDITCARD:
            case DEPOSITCARD:
                System.out.println("输入卡号支付");
                break;
        }
    }
}
