package chap09;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame09_5 extends JFrame {
    MyFrame09_5() {
        setTitle("4x4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new GridLayout(4, 4));
        Color [] colors = {
                Color.RED,      Color.ORANGE,       Color.YELLOW,       Color.GREEN,        Color.CYAN,
                Color.BLUE,     Color.LIGHT_GRAY,   Color.PINK,         Color.BLACK,        Color.ORANGE
        };
        for (int i = 0; i < 16; ++i) {
            JButton btn = new JButton(String.valueOf(i));
            Random rnd = new Random();
            btn.setBackground(colors[rnd.nextInt(10)]);
            con.add(btn);
        }

        setSize(400, 400);
        setVisible(true);
    }
}

public class Prob5 {
    public static void main(String [] args) {
        new MyFrame09_5();
    }
}
