package 常用API_正则表达式_Lambda_算法02.大作业06.Calendar;

/*
当我们输入年份的时候,
会自动计算2月份的天数,以及自动判断是否为闰年,一年有多少天,设计程序,实现此功能!
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.print("请输入年份：");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        //获取当前时间的日历对象
        Calendar cal = Calendar.getInstance();

        //设置日历对象的 年 月 日
        //设置成3月1日
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, 2);//由于国外的月份和国内的月份不一样,所以,当我们设置2月的时候其实代表的是我们国内的3月
        cal.set(Calendar.DAY_OF_MONTH, 1);

        //通过add方法将3月1日的日历减去一天获得2月的最后一天
        cal.add(Calendar.DAY_OF_MONTH, -1);

        //通过本月的第几天判断2月到底是多少天
        if (cal.get(Calendar.DAY_OF_MONTH) == 28) {
            System.out.println(year + "年" + "2月份天数：" + "28");
            System.out.println("不是闰年");
            System.out.println("共365天");
        } else {
            System.out.println(year + "年" + "2月份天数：" + "29");
            System.out.println("是闰年");
            System.out.println("共366天");
        }
    }
}
