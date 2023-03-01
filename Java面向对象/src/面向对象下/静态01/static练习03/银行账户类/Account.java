package 面向对象下.静态01.static练习03.银行账户类;

/*声明一个银行账户类Account，
- 成员变量：利率、账号、余额，其中所有账户的利率是相同的，所有成员变量都私有化。
- 提供get/set
- 提供有参构造public Account(String id ,double balance)
- 提供计算年利息方法public double annualInterest()，余额*利率
- 重写toString方法，返回账号和余额、年利息
*/

public class Account {
    private static double interestRate;
    private String id;
    private double balance;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double annualInterest() {
        return balance * interestRate;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                "annualInterest=" + annualInterest() +
                '}';
    }
}
