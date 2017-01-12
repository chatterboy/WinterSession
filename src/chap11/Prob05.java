package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 * Created by AIServer on 2017-01-11.
 */
class Frame11_05 extends JFrame {
    Frame11_05() {
        setTitle("Focus Practice Frame");
        setSize(new Dimension(400, 100));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JLabel lb = new JLabel("입력한 후 다른 창에 마우스 클릭하면 대문자로 변합니다.");
        JTextField tf = new JTextField(10);

        tf.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                JTextField tf = (JTextField) e.getSource();
                tf.setText(tf.getText().toUpperCase());
            }
        });

        add(lb);
        add(tf);

        setVisible(true);
    }
}

public class Prob05 {
    public static void main(String [] args) {
        new Frame11_05();
    }
}