package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-04.
 */
class RanPoint extends Point {
    RanPoint() {
        x = (int)(Math.random() * 300) + 50;
        y = (int)(Math.random() * 300) + 50;
    }
}

class Frame10_6 extends JFrame {
    Frame10_6() {
        setTitle("클릭 연습 용 응용프로그램");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(null);

        JLabel lb = new JLabel("C");
        lb.setLocation(new Point(100, 100));
        lb.setSize(50, 50);
        lb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JLabel lb = (JLabel)e.getSource();
                lb.setLocation(new RanPoint());
            }
        });

        con.add(lb);

        setSize(400, 400);
        setVisible(true);
    }
}

public class Prob6 {
    public static void main(String [] args) {
        new Frame10_6();
    }
}
