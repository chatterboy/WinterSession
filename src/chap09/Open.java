package chap09;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-02.
 */
class NorthPanel extends JPanel {
    NorthPanel() {
        setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
        setBackground(Color.LIGHT_GRAY);
    }
}

class CenterPanel extends JPanel {
    CenterPanel() {
        setLayout(null);
        String [] strings = {
                "Hello",        "Love",         "Java"
        };
        for (int i = 0; i < strings.length; ++i) {
            JLabel lb = new JLabel(strings[i]);
            int x = (int)(Math.random() * 250) + 50;
            int y = (int)(Math.random() * 250) + 50;
            lb.setLocation(x, y);
            lb.setSize(30, 30);
            lb.setOpaque(true);
            add(lb);
        }
    }
}

class MyFrame09_ extends JFrame {
    MyFrame09_() {
        setTitle("Open Challenge 9");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.add(new NorthPanel(), BorderLayout.NORTH);
        con.add(new CenterPanel(), BorderLayout.CENTER);

        setVisible(true);
        setSize(400, 400);
    }
}

public class Open {
    public static void main(String [] args) {
        new MyFrame09_();
    }
}
