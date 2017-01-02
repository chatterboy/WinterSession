package chap09;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-02.
 */

class MyFrame09_2 extends JFrame {
    MyFrame09_2() {
        setTitle("BorderLayout Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new BorderLayout(5, 7));
        con.add(new JButton("Center"), BorderLayout.CENTER);
        con.add(new JButton("East"), BorderLayout.EAST);
        con.add(new JButton("South"), BorderLayout.SOUTH);
        con.add(new JButton("West"), BorderLayout.WEST);
        con.add(new JButton("North"), BorderLayout.NORTH);

        setSize(300, 200);
        setVisible(true);
    }
}

public class Prob2 {
    public static void main(String [] args) {
        new MyFrame09_2();
    }
}
