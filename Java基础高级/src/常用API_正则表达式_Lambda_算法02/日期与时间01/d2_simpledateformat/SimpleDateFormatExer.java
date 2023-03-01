package 常用API_正则表达式_Lambda_算法02.日期与时间01.d2_simpledateformat;

/*
某购物网站举办秒杀活动
开始时间2020年11月11日 0:0:0 结束时间2020年11月11日 0:10:0
当前活动结束后，系统记录到2位用户的付款时间分别如下：
小贾下单并付款的时间为：2020年11月11日 0:03:47
小皮下单并付款的时间为：2020年11月11日 0:10:11
规则：顾客的付款时间必须在秒杀时间之内，请判断出两位顾客是否秒杀成功。
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExer {
    public static void main(String[] args) throws ParseException {
        String userTimeStr01 = "2020年11月11日 0:03:47";
        String userTimeStr02 = "2020年11月11日 0:10:11";
        String startTimeStr = "2020年11月11日 0:0:0";
        String endTimeStr = "2020年11月11日 0:10:0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        /*// 获取抢购开始和截止时间的时间戳
        Date startDate = sdf.parse(startTimeStr);
        Date endDate = sdf.parse(endTimeStr);
        long startTime = startDate.getTime();
        long endTime = endDate.getTime();

        //获取用户下单时间的时间戳
        long userTime01 = sdf.parse(userTimeStr01).getTime();
        long userTime02 = sdf.parse(userTimeStr02).getTime();

        long[] arr = {userTime01, userTime02};
        for (long userTime : arr) {
            if (userTime >= startTime && userTime <= endTime) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }
        }*/

        Date startDate = sdf.parse(startTimeStr);
        Date endDate = sdf.parse(endTimeStr);
        Date userDate01 = sdf.parse(userTimeStr01);
        Date userDate02 = sdf.parse(userTimeStr02);

        if (userDate01.after(startDate) && userDate01.before(endDate)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

        if (userDate02.after(startDate) && userDate02.before(endDate)) {
            System.out.println("成功");
        } else {
            System.out.println("失败");
        }

    }
}
