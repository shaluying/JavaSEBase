package 面向对象上.练习03;

public class Employee {
    String name;
    MyDate birthday;

    void setBirthday(int year, int month, int day) {
        birthday = new MyDate();
        birthday.year = year;
        birthday.month = month;
        birthday.day = day;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getInfo() {
        return "姓名：" + name + " 生日：" + birthday.getDateInfo();
    }
}
