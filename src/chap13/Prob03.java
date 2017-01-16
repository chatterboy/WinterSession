package chap13;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;

/**
 * Created by AIServer on 2017-01-16.
 */
class Frame13_03 extends JFrame {
    Frame13_03() {
        setTitle("디지털 시계 만들기");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lb = new JLabel(Prob03.gettime());

        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setVerticalAlignment(SwingConstants.CENTER);
        lb.setFont(new Font("Arial", Font.PLAIN, 40));

        Thread th = new Thread(() -> {
            for (;;) {
                lb.setText(Prob03.gettime());
            }
        });

        th.start();

        add(lb, BorderLayout.CENTER);

        setVisible(true);
    }
}

public class Prob03 {
    public static String gettime() {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int min = c.get(Calendar.MINUTE);
        int second = c.get(Calendar.SECOND);

        String clockText = Integer.toString(hour);
        clockText = clockText.concat(":");
        clockText = clockText.concat(Integer.toString(min));
        clockText = clockText.concat(":");
        clockText = clockText.concat(Integer.toString(second));

        return clockText;
    }
    public static void main(String [] args) {
        new Frame13_03();
    }
}
