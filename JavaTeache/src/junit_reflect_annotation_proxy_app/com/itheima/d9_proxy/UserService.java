package junit_reflect_annotation_proxy_app.com.itheima.d9_proxy;

/**
   模拟用户业务功能
 */
public interface UserService {
    String login(String loginName, String passWord) ;
    void selectUsers();
    boolean deleteUsers();
    void updateUsers();
}
