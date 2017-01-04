package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseWheelEvent;

/**
 * Created by AIServer on 2017-01-04.
 */
class Frame10_7 extends JFrame {
    Frame10_7() {
        setTitle("마우스 휠을 굴려 폰트 크기 ...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(null);

        JLabel lb = new JLabel("Love Java");
        lb.setFont(new Font("Arial", Font.PLAIN, 10));
        lb.setLocation(new Point(100, 100));
        lb.setSize(50, 50);
        lb.addMouseWheelListener((e) -> {
            int n = e.getWheelRotation();
            if (n < 0) {
                int sz = lb.getFont().getSize();
                if (sz - 5 > 5) {
                    lb.setFont(new Font("Arial", Font.PLAIN, lb.getFont().getSize() - 5));
                }
            } else {
                lb.setFont(new Font("Arial", Font.PLAIN, lb.getFont().getSize()));
            }
        });

        con.add(lb);

        setSize(400, 400);
        setVisible(true);
    }
}

public class Prob7 {
    public static void main(String [] args) {
        new Frame10_7();
    }
}
