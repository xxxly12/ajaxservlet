package something.schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class demo01 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Calendar instance = Calendar.getInstance();
        instance.set(Calendar.HOUR_OF_DAY,9);
        instance.set(Calendar.MINUTE,50);
        instance.set(Calendar.SECOND,0);
        Date date = instance.getTime();
        System.out.println(date);
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("输入的内容============");
            }
        },date,5*1000);
    }
}
