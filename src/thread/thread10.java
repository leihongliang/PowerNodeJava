package thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 定时执行
 */
public class thread10 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date firstTime = sdf.parse("2022-01-05 21:46:00");
            timer.schedule(new LogTimerTask(), firstTime, 1000*5);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
// 定时任务，是一个抽象类
class LogTimerTask extends TimerTask{
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = sdf.format(new Date());
        System.out.println(strTime + "ok");
    }
}
