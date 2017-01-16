package chap13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-16.
 */
class Bullet extends JLabel {
    Bullet() {
        setSize(10, 10);
        setLocation(200, 200);
        setBackground(Color.RED);
        setOpaque(true);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                Thread th = new Thread(() -> {
                    for (int x = getX(), y = getY(); y >= 0; --y) {
                        setLocation(x, y);
                        try {
                            Thread.sleep(4);
                        } catch (InterruptedException e1) {
                            e1.printStackTrace();
                        }
                    }
                    init();
                });

                th.start();
            }
        });
    }
    void init() {
        setLocation(200, 200);
    }
}

class Aim extends JLabel {
    Bullet bullet;
    Aim(Bullet bullet) {
        this.bullet = bullet;

        setSize(20, 20);
        setLocation(0, 0);
        setBackground(Color.BLUE);
        setOpaque(true);

        Thread th = new Thread(() -> {
            int m = 400;
            for (int x = getX(), y = getY();; ++x, x %= m) {
                if (!isShot()) setLocation(x, y);
                else {
                    init();
                    x = getX();
                    y = getY();
                }
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        th.start();
    }
    boolean isShot() {
        int bx1 = bullet.getX(),            by1 = bullet.getY();
        int bx2 = bx1 + bullet.getWidth(),  by2 = by1 + bullet.getHeight();
        int x1 = getX(),                    y1 = getY();
        int x2 = x1 + getWidth(),           y2 = y1 + getHeight();
        if (x1 > bx2 || x2 < bx1 || y1 > by2 || y2 < by1) return false;
        return true;
    }
    void init() {
        setLocation(0, 0);
    }
}

class Gun extends JLabel {
    Gun() {
        setSize(40, 40);
        setLocation(185, 210);
        setBackground(Color.BLACK);
        setOpaque(true);
    }
}

class Frame13_05 extends JFrame {
    Frame13_05() {
        setTitle("사격 게임");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        Gun gun = new Gun();
        Bullet bullet = new Bullet();
        Aim aim = new Aim(bullet);

        add(gun);
        add(bullet);
        add(aim);

        setVisible(true);

        bullet.requestFocus();
    }
}

public class Prob05 {
    public static void main(String [] args) {
        new Frame13_05();
    }
}
