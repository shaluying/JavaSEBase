package 面向对象中.继承02.继承练习03.练习二;

/*声明一个银行信用卡类，继承储蓄卡类
- 增加属性：本月可透支总额度，本月已透支金额
- 重写public void withdraw(double money)，可透支，
  - 取款金额超过账户余额+本月还可透支额度，提示超过可透支额度
  - 取款金额在账户余额范围内，不用透支
  - 取款金额超过账户余额但在可透支范围内，需要透支
- 重写public void save(double money)，
  - 存款金额不能为负数，否则提示存款金额不能为负数
  - 本次存款金额只够偿还部分已透支金额
  - 本次存款金额除了偿还透支金额，还有剩余
  */

public class CreditCard extends DepositCard {
    double creditLine;
    double expendCreditLine;

    @Override
    public void withdraw(double money) {
        if (money > getBalance() + creditLine - expendCreditLine) {
            System.out.println("超过可透支额度");
        } else if (money > getBalance()) {
            expendCreditLine += money - getBalance();
            setBalance(0);
            System.out.println("取款成功！本月已透支：" + expendCreditLine);
        } else {
            super.withdraw(money);
        }

    }

    @Override
    public void save(double money) {
        if (money < 0) {
            System.out.println("存款金额不能为负数！");
        } else if (money <= expendCreditLine) {
            expendCreditLine -= money;
            System.out.println("本次存款金额只够偿还部分已透支金额!");
            System.out.println("已透支额度：" + expendCreditLine);
        } else {
            if (expendCreditLine == 0) {
                super.save(money);
            } else {
                super.save(money - expendCreditLine);
                expendCreditLine = 0;
                System.out.println("本次存款金额除了偿还透支金额，还有剩余!");
            }

        }

    }
}
