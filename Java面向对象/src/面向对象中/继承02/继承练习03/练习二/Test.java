package 面向对象中.继承02.继承练习03.练习二;

/*
1）声明一个银行储蓄卡类，
- 包含属性：账户，余额，属性私有化
- 包含get/set方法
- public void withdraw(double money)：取款，
  - 取款金额不能为负数，否则提示取款金额不能为负数
  - 取款金额不能超过账户余额，否则提示余额不足
- public void save(double money)：存款，
  - 存款金额不能为负数，否则提示存款金额不能为负数
- public String getInfo() 可以返回账户和余额

（2）声明一个银行信用卡类，继承储蓄卡类
- 增加属性：本月可透支总额度，本月已透支金额
- 重写public void withdraw(double money)，可透支，
  - 取款金额超过账户余额+本月还可透支额度，提示超过可透支额度
  - 取款金额在账户余额范围内，不用透支
  - 取款金额超过账户余额但在可透支范围内，需要透支
- 重写public void save(double money)，
  - 存款金额不能为负数，否则提示存款金额不能为负数
  - 本次存款金额只够偿还部分已透支金额
  - 本次存款金额除了偿还透支金额，还有剩余

（3）在测试类中，分别创建两种卡对象，测试
*/

public class Test {
    public static void main(String[] args) {
        DepositCard d = new DepositCard();
        CreditCard c = new CreditCard();

        c.setAccount(11054);
        c.setBalance(50000);
        c.creditLine = 10000;
        System.out.println(c.getInfo());
        c.withdraw(-5);
        c.withdraw(12000);
        System.out.println(c.getInfo());
        c.save(20000);
        System.out.println(c.getInfo());
        c.withdraw(60000);
        System.out.println(c.getInfo());
        c.withdraw(100000);
        c.save(1000);
        c.save(200000);
        System.out.println(c.getInfo());
    }
}
