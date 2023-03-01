package 集合和泛型03.大作业03.ArrayList集合_迭代器_String04;

/*
模拟注册用户,如果存在要注册的用户,
直接显示"对不起,您注册的用户已经存在!请直接登录!",可以继续注册;
 如果不存在要注册的用户,显示"注册成功!",并将所有用户的信息显示出来!
 */

public class User {
    private String Name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        Name = name;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
