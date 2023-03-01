package 日志框架和阶段项目06.电影购票系统02.bean;

import java.util.HashMap;
import java.util.Map;

/*
   客户角色
 */
public class Customer extends User {
    // 定义一个属性存储购买记录。
    //第一个参数 已经购买电影的名称 第二个参数 是否评价的标记
    private Map<String, Boolean> buyMovies = new HashMap<>();

    public Map<String, Boolean> getBuyMovies() {
        return buyMovies;
    }

    public void setBuyMovies(Map<String, Boolean> buyMovies) {
        this.buyMovies = buyMovies;
    }
}
