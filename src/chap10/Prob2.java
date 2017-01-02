package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLSyntaxErrorException;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame10_2 extends JFrame {
    MyFrame10_2() {
        setTitle("드래깅동안 YELLO...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setBackground(Color.GREEN);
        con.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Container con = (Container)e.getSource();
                con.setBackground(Color.YELLOW);
            }
            @Override
            public void mouseReleased(MouseEvent e) {
                Container con = (Container)e.getSource();
                con.setBackground(Color.GREEN);
            }
        });

        setSize(400, 400);
        setVisible(true);
    }
}

public class Prob2 {
    public static void main(String [] args) {
        new MyFrame10_2();
    }
}
