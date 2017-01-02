package chap09;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame09_4 extends JFrame {
    MyFrame09_4() {
        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new GridLayout(1, 10));
        Color [] colors = {
                Color.RED,      Color.ORANGE,       Color.YELLOW,       Color.GREEN,        Color.CYAN,
                Color.BLUE,     Color.LIGHT_GRAY,   Color.PINK,         Color.BLACK,        Color.ORANGE
        };
        for (int i = 0; i < colors.length; ++i) {
            JButton btn = new JButton(String.valueOf(i));
            btn.setBackground(colors[i]);
            con.add(btn);
        }

        setSize(500, 200);
        setVisible(true);
    }
}

public class Prob4 {
    public static void main(String [] args) {
        new MyFrame09_4();
    }
}
