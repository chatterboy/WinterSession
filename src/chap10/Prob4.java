package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-04.
 */
class MyFrame10_4 extends JFrame {
    MyFrame10_4() {
        setTitle("Left 키로 문자열 ...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JLabel lb = new JLabel("Love Java");
        lb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) { // <-
                    JLabel lb = (JLabel)e.getSource();
                    String text = lb.getText();
                    lb.setText(text.substring(1) + text.substring(0, 1));
                }
                if (e.getKeyCode() == 39) { // ->
                    JLabel lb = (JLabel)e.getSource();
                    String text = lb.getText();
                    lb.setText(text.substring(text.length() - 1) + text.substring(0, text.length() - 1));
                }
            }
        });

        con.add(lb);

        setSize(400, 400);
        setVisible(true);
        lb.requestFocus();
    }
}

public class Prob4 {
    public static void main(String [] args) {
        new MyFrame10_4();
    }
}
