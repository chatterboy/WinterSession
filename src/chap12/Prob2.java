package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by AIServer on 2017-01-12.
 */
class Panel12_2 extends JPanel {
    ImageIcon ii;
    Image img;
    int x;
    int y;
    int w;
    int h;
    Panel12_2() {
        setLayout(new FlowLayout());

        ii = new ImageIcon("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap12/back.png");
        img = ii.getImage();
        x = y = 50;
        w = h = 40;

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                x = e.getX();
                y = e.getY();

                update();
            }
        });

        setVisible(true);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);

        g.setColor(Color.GREEN);
        g.fillOval(x, y, w, h);
    }
    void update() {
        repaint();
    }
}

class Frame12_2 extends JFrame {
    Frame12_2() {
        setTitle("이미지 위에 원 드래깅 연습");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel12_2 pnl = new Panel12_2();

        add(pnl);

        setVisible(true);
    }
}

public class Prob2 {
    public static void main(String [] args) {
        new Frame12_2();
    }
}
