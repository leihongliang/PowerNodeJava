package javase.number;

import java.util.Date;

public class datetest3 {
    public static void main(String[] args) {
        Date time = new Date(1000000);
        System.out.println(time);

        //昨天时间
        Date time2 = new Date(System.currentTimeMillis()-1000*60*60*24);
        System.out.println(time2);


    }


}
