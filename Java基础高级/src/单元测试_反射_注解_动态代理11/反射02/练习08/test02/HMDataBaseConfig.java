package 单元测试_反射_注解_动态代理11.反射02.练习08.test02;
/*
    定义HMDataBaseConfig类
 */
public class HMDataBaseConfig {
    private String driverClass;
    private String url;
    private String user;
    private String password;

    @Override
    public String toString() {
        return "HMDataBaseConfig{" +
                "driverClass='" + driverClass + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    //空参构造
    public HMDataBaseConfig() {
    }
    //满参构造
    public HMDataBaseConfig(String driverClass, String url, String user, String password) {
        this.driverClass = driverClass;
        this.url = url;
        this.user = user;
        this.password = password;
    }
    //set/get方法
    public String getDriverClass() {
        return driverClass;
    }
    //driverClass --> setDriverClass
    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
