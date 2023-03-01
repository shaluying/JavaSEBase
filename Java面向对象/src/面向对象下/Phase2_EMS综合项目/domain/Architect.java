package 面向对象下.Phase2_EMS综合项目.domain;

public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, int stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String say() {
        return super.getInfo() + "\t架构师" + "\t" + getBonus() + "\t" + stock;
    }
}
