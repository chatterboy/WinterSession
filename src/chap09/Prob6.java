package chap09;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame09_6 extends JFrame {
    MyFrame09_6() {
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(null);
        for (int i = 0; i < 20; ++i) {
            JLabel lb = new JLabel();
            int x = (int)(Math.random() * 200) + 50;
            int y = (int)(Math.random() * 200) + 50;
            lb.setLocation(x, y);
            lb.setSize(10, 10);
            lb.setBackground(Color.BLUE);
            lb.setOpaque(true);
            con.add(lb);
        }

        setSize(300, 300);
        setVisible(true);
    }
}

public class Prob6 {
    public static void main(String [] args) {
        new MyFrame09_6();
    }
}
