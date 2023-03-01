package IO流二08.Properties05;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 目标：Properties的概述和使用(框架底层使用，了解这个技术即可)（保存数据到属性文件）

 Properties: 属性集对象。
 其实就是一个Map集合。也就是一个键值对集合，但是我们一般不会当集合使用，
 因为有HashMap。

 Properties核心作用：
 Properties代表的是一个属性文件，可以把键值对的数据存入到一个属性文件中去。
 属性文件：后缀是.properties结尾的文件,里面的内容都是 key=value。

 大家在后期学的很多大型框架技术中，属性文件都是很重要的系统配置文件。
 users.properties
 admin=123456
 dlei=dlei

 需求：使用Properties对象生成一个属性文件，里面存入用户名和密码信息。

 Properties的方法：
 -- public Object setProperty(String key, String value) ： 保存一对属性。  (put)
 -- public String getProperty(String key) : 使用此属性列表中指定的键搜索属性值 (get)
 -- public Set<String> stringPropertyNames() : 所有键的名称的集合  (keySet())
 -- public void store(OutputStream out, String comments): 保存数据到属性文件中去
 -- public void store(Writer fw, String comments): 保存数据到属性文件中去

 小结：
 Properties可以保存键值对数据到属性文件

 */

public class PropertiesDemo1 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("王五", "55");
        properties.setProperty("asdf", "4");
        properties.setProperty("dfs", "saf");
        properties.setProperty("@#", "%5");//加载到配置文件中为 @\#=%5
        System.out.println(properties);
        System.out.println(properties.getProperty("王五"));

        /*
         参数一：保存管道 字符输出流管道
         参数二：保存心得
         */
        properties.store(new FileWriter("Java基础高级\\src\\IO流二08\\Properties05\\data.properties"), "我很开心，I am is happy");

    }
}
