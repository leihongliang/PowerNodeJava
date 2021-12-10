package javase.number;

import java.text.SimpleDateFormat;
import java.util.Date;

public class datetest {
    public static void main(String[] args) throws Exception {
        //获取系统当前时间
        Date nowTime = new Date();
        System.out.println(nowTime);

        //按固定格式显示当前时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:ss:mm");
        String nowTimeStr = sdf.format(nowTime);
        System.out.println(nowTimeStr);

        //字符串String，转化成Date
        String time = "2020-11-19 20:08:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date datetime = sdf2.parse(time);
        System.out.println(datetime);

    }
}
