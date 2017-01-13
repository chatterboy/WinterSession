package chap12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-12.
 */
class Panel12_1 extends JPanel {
    ImageIcon ii = new ImageIcon("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap12/back.png");
    Image img = ii.getImage();
    Panel12_1() {
        setLayout(new FlowLayout());

        JButton btn = new JButton("Hello");

        add(btn);

        setVisible(true);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
}

class Frame12_1 extends JFrame {
    Frame12_1() {
        setTitle("이미지 그리기 연습");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel12_1 pnl = new Panel12_1();

        add(pnl, BorderLayout.CENTER);

        setVisible(true);
    }
}

public class Prob1 {
    public static void main(String [] args) {
        new Frame12_1();
    }
}
