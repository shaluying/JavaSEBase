package 单元测试_反射_注解_动态代理11.动态代理04;

/**
   模拟用户业务功能
 */
public interface UserService {
    String login(String loginName, String passWord) ;
    void selectUsers();
    boolean deleteUsers();
    void updateUsers();
}
