package chap13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-16.
 */
class Thread13_02 extends Thread {
    JLabel label;
    int flag = 0;
    Thread13_02(JLabel label) {
        this.label = label;

        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                flag ^= 1;
            }
        });
    }
    @Override
    public void run() {
        for (;;) {
            if (flag == 0) interrupt();
            else {
                for (int i = 1; flag == 1; ++i) {
                    label.setText(String.valueOf(i));
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

class Frame13_02 extends JFrame {
    Frame13_02() throws InterruptedException {
        setTitle("타이머 스레드 제어");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lb = new JLabel("0");

        lb.setFont(new Font("Arial", Font.PLAIN, 40));
        lb.setHorizontalAlignment(SwingConstants.CENTER);
        lb.setVerticalAlignment(SwingConstants.CENTER);

        Thread13_02 th = new Thread13_02(lb);

        add(lb, BorderLayout.CENTER);

        th.start();

        setVisible(true);
    }
}

public class Prob02 {
    public static void main(String [] args) throws InterruptedException {
        new Frame13_02();
    }
}
