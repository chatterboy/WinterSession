package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

/**
 * Created by AIServer on 2017-01-13.
 */
class Panel12_6 extends JPanel {
    int w;
    int h;
    int [] offsets;
    Panel12_6() {
        offsets = new int[10];

        for (int i = 0; i < offsets.length; ++i) {
            offsets[i] = 10 * i;
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        w = getWidth();
        h = getHeight();

        g.setColor(Color.BLACK);

        for (int i = 0; i < offsets.length; ++i) {
            int [] x = {w / 2,              0 + offsets[i],     w / 2,              w - offsets[i]};
            int [] y = {0 + offsets[i],     h / 2,              h - offsets[i],     h / 2};

            g.drawPolygon(x, y, 4);
        }
    }
}

class Frame12_6 extends JFrame {
    Frame12_6() {
        setTitle("그래픽 다각형 연습");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel12_6 pnl = new Panel12_6();

        addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {}
        });

        add(pnl);

        setVisible(true);
    }
}

public class Prob6 {
    public static void main(String [] args) {
        new Frame12_6();
    }
}
