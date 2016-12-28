package chap06;

import java.util.Calendar;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob03 {
    public static void main(String [] args) {
        // Good morning     =>      [4:00am, 12:00pm)
        // Good afternoon   =>      [12:00pm, 6:00pm)
        // Good evening     =>      [6:00pm, 4:00am)
        Calendar today = Calendar.getInstance();
        int am_pm = today.get(Calendar.AM_PM);
        int hour = today.get(Calendar.HOUR);
        if (am_pm == 0) {
            if (hour >= 4) {
                System.out.print("Good Morning");
            } else {
                System.out.print("Good Evening");
            }
        } else {
            if (hour >= 6) {
                System.out.print("Good Evening");
            } else {
                System.out.print("Good Afternoon");
            }
        }
    }
}
