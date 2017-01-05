package chap11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-05.
 */
class Frame11_02 extends JFrame {
    Frame11_02() {
        setTitle("JTextField and JCo...");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JTextField tf = new JTextField(10);
        JComboBox cb = new JComboBox();

        tf.addActionListener((e) -> {
            String cmd = e.getActionCommand();
            cb.addItem(cmd);
        });

        add(tf);
        add(cb);

        setVisible(true);
    }
}

public class Prob02 {
    public static void main(String [] args) {
        new Frame11_02();
    }
}
