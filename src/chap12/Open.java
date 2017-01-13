package chap12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-13.
 */
class ImagePanel extends JPanel {
    ImageIcon icon = new ImageIcon("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap12/1.png");
    Image img = icon.getImage();
    Point p = new Point(20, 20);

    ImagePanel() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                int x = (int) p.getX();
                int y = (int) p.getY();
                switch (e.getKeyCode()) { // left, up, right, down
                    case 37:
                        x -= 10;
                        if (x >= 0) p.setLocation(x, (int) p.getY());
                        break;
                    case 38:
                        y -= 10;
                        if (y >= 0) p.setLocation((int) p.getX(), y);
                        break;
                    case 39:
                        x += 10;
                        if (x <= getWidth() - 50) p.setLocation(x, (int) p.getY());
                        break;
                    case 40:
                        y += 10;
                        if (y <= getHeight() - 50) p.setLocation((int) p.getX(), y);
                        break;
                    default: break;
                }

                repaint();
            }
        });
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setClip((int) p.getX(), (int) p.getY(), 50, 50);
        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}

class Frame12_O extends JFrame {
    Frame12_O() {
        setTitle("Open Challenge 12");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImagePanel ip = new ImagePanel();

        add(ip);

        setVisible(true);
        ip.requestFocus();
    }
}

public class Open {
    public static void main(String [] args) {
        new Frame12_O();
    }
}
