package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame10_1 extends JFrame {
    MyFrame10_1() {
        setTitle("마우스 올리기 내...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(null);

        JLabel lb = new JLabel("사랑해");
        lb.setLocation(150, 150);
        lb.setSize(100, 50);
        lb.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                JLabel lb = (JLabel)e.getSource();
                lb.setText("Love Java");
            }
            @Override
            public void mouseExited(MouseEvent e) {
                JLabel lb = (JLabel)e.getSource();
                lb.setText("사랑해");
            }
        });

        add(lb);

        setSize(400, 400);
        setVisible(true);
    }
}

public class Prob1 {
    public static void main(String [] args) {
        new MyFrame10_1();
    }
}
