package chap13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by AIServer on 2017-01-16.
 */
class Bubble extends JLabel {
    boolean over = false;
    Bubble(int x, int y) {
        setSize(20, 20);
        setLocation(x, y);
        setBackground(Color.CYAN);
        setOpaque(true);

        Thread th = new Thread(() -> {
            for (int xx = getX(), yy = getY(); yy >= 0; --yy) {
                setLocation(xx, yy);
                try {
                    Thread.sleep(4);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            over = true;

            Container parent = this.getParent();
            parent.remove(this);
            parent.validate();
            parent.repaint();
        });

        th.start();
    }
    boolean isOver() {
        return over;
    }
}

class Frame13_06 extends JFrame {
    ArrayList<Bubble> bubbles;

    Frame13_06() {
        setTitle("버블 게임");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        bubbles = new ArrayList<Bubble>();

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                Bubble bubble = new Bubble(x, y);
                add(bubble);
                bubbles.add(bubble);
            }
        });

        Thread update = new Thread(() -> {
            for (;;) {
                int n = bubbles.size();
                for (int i = 0; i < n; ++i) {
                    if (bubbles.get(i).isOver()) {
                        bubbles.remove(i);
                        break;
                    }
                }
            }
        });

        update.start();

        setVisible(true);
    }
}

public class Prob06 {
    public static void main(String [] args) {
        new Frame13_06();
    }
}
