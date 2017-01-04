package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-04.
 */
class Frame10_5 extends JFrame {
    Frame10_5() {
        setTitle("+,- 키로 폰트 크기 조절");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JLabel lb = new JLabel("Love Java");
        lb.setFont(new Font("Arial", Font.PLAIN, 10));
        lb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 107) { // '+'
                    JLabel lb = (JLabel)e.getSource();
                    Font ft = lb.getFont();
                    int sz = ft.getSize();
                    lb.setFont(new Font("Arial", Font.PLAIN, sz + 5));
                }
                if (e.getKeyCode() == 109) { // '-'
                    JLabel lb = (JLabel)e.getSource();
                    Font ft = lb.getFont();
                    int sz = ft.getSize();
                    if (sz - 5 > 5) {
                        lb.setFont(new Font("Arial", Font.PLAIN, sz - 5));
                    }
                }
            }
        });

        con.add(lb);

        setSize(400, 400);
        setVisible(true);
        lb.requestFocus();
    }
}

public class Prob5 {
    public static void main(String [] args) {
        new Frame10_5();
    }
}
