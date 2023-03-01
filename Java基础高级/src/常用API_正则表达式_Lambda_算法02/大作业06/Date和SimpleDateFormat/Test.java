package 常用API_正则表达式_Lambda_算法02.大作业06.Date和SimpleDateFormat;

/*
某公司人事举办了这样一个活动,凡是入职6周年的员工,赠送一个精美小礼品,
于是员工纷纷去计算了自己的入职年限,请设计程序,帮同事们计算出入职年限.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入与你的入职时间：");

        System.out.print("年：");
        String year = sc.next();

        System.out.print("月：");
        String month = sc.next();

        String srtTime = year + "年" + month + "月";

        //解析时间获取开始工作的日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月");
        Date startWorkTime = sdf.parse(srtTime);

        //获取此刻时间对象
        Date nowTime = new Date();

        if ((nowTime.getTime() - startWorkTime.getTime()) - (6L * 365 * 24 * 3600 * 1000) > 0) {
            System.out.println("请来领取您的礼品");
        } else {
            System.out.println("对不起，你的入职时间不够6周年！");
        }
    }
}
