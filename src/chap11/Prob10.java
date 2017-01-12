package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-12.
 */
class GameLabel11_10 extends JLabel {
    int id;
    GameLabel11_10(String lb, int id) {
        super(lb);
        this.id = id;
    }
}

class GamePanel11_10 extends JPanel {
    int now = 0;
    GameLabel11_10 [] lbs = new GameLabel11_10[10];
    GamePanel11_10() {
        setLayout(null);

        for (int i = 0; i < lbs.length; ++i) {
            lbs[i] = new GameLabel11_10(String.valueOf(i), i);

            Point p = new Point((int) (Math.random() * 200) + 50, (int) (Math.random() * 200) + 50);

            lbs[i].setLocation(p);
            lbs[i].setSize(15, 15);
            lbs[i].setForeground(Color.red);

            lbs[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    GameLabel11_10 lb = (GameLabel11_10) e.getSource();
                    update(lb);
                }
            });
        }

        for (GameLabel11_10 lb : lbs) add(lb);

        setVisible(true);
    }
    void update(GameLabel11_10 lb) {
        if (lb.id == now) {
            lb.setVisible(false);
            ++now;
        }
        if (now == 10) {
            for (int i = 0; i < lbs.length; ++i) {
                Point p = new Point((int) (Math.random() * 200) + 50, (int) (Math.random() * 200) + 50);

                lbs[i].setLocation(p);
                lbs[i].setVisible(true);
            }
            now = 0;
        }
    }
}

class Frame11_10 extends JFrame {
    Frame11_10() {
        setTitle("Ten 레이블 클릭");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel11_10 pl = new GamePanel11_10();


        add(pl);

        setVisible(true);
    }
}

public class Prob10 {
    public static void main(String [] args) {
        new Frame11_10();
    }
}
