package 多线程09.大作业08.领双色球入会场04.teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/*
    1、定义工具类DoubleColorBallUtils,产生双色球
        1.1、 构造方法私有
        1.2、 定义静态方法create,产生一个双色球,返回String
 */
public class DoubleColorBallUtils {
    //1.1、 构造方法私有
    private DoubleColorBallUtils(){}

    //1.2、 定义静态方法create,产生一个双色球,返回String
    public static String create() {
        //创建Random对象,产生int数字
        Random r = new Random();
        //创建List集合对象,存储双色球
        List<String> list = new ArrayList<>();
        //存储红球,只要list集合长度<6,就添加红球
        while(list.size()<6) {
            //产生1-33的数字
            int num = r.nextInt(33)+ 1;
            //保证数字是两位数字,一位数字前面补0
            String strNum = num<10?0+""+num:num+"";
            //保证红球不重复
            if (!list.contains(strNum)) {
                list.add(strNum);
            }
        }
        //对红球按照从小到大的顺序排序
        Collections.sort(list);
        //产生一个蓝球
        int num = r.nextInt(16)+ 1;
        //保证数字是两位数字,一位数字前面补0
        String strNum = num<10?0+""+num:num+"";
        //添加蓝球
        list.add(strNum);
        //返回String
        return list.toString();
    }
}
