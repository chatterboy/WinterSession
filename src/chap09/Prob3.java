package chap09;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame09_3 extends JFrame {
    MyFrame09_3() {
        setTitle("Ten Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new GridLayout(1, 10));
        for (int i = 0; i < 10; ++i) {
            con.add(new JButton(String.valueOf(i)));
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class Prob3 {
    public static void main(String [] args) {
        new MyFrame09_3();
    }
}
