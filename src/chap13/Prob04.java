package chap13;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by AIServer on 2017-01-16.
 */
class Frame13_04 extends JFrame {
    Frame13_04() {
        setTitle("VibratingFrame");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocation(100, 100);

        Thread th = new Thread(() -> {
            for (;;) {
                Point p = getLocation();
                int x = (int)p.getX() + (int)(Math.random() * 3) - 1;
                int y = (int)p.getY() + (int)(Math.random() * 3) - 1;
                setLocation(x, y);
            }
        });

        th.start();

        setVisible(true);
    }
}

public class Prob04 {
    public static void main(String [] args) {
        new Frame13_04();
    }
}
