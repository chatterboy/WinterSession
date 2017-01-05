package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-05.
 */
class TopPanel11_03 extends JPanel {
    JLabel lb;
    JTextField tf;
    JButton btn;
    TopPanel11_03() {
        setLayout(new FlowLayout());

        lb = new JLabel("금액");
        tf = new JTextField(15);
        btn = new JButton("계산");

        btn.addActionListener((e) -> {
            JPanel rootPanel = (JPanel) this.getRootPane().getContentPane().getComponent(0);
            BottomPanel11_03 bottomPanel = (BottomPanel11_03) rootPanel.getComponent(1);
            int [] changes = {
                    50000,      10000,      1000,       500,
                    100,        50,         10,         1
            };
            int money = Integer.parseInt(tf.getText());
            for (int i = 0; i < changes.length; ++i) {
                String res = String.valueOf(money / changes[i]);
                money %= changes[i];
                bottomPanel.tfs[i].setText(res);
            }
        });

        add(lb);
        add(tf);
        add(btn);
    }
}

class BottomPanel11_03 extends JPanel {
    JLabel [] lbs = new JLabel[8];
    JTextField [] tfs = new JTextField[8];
    BottomPanel11_03() {
        setLayout(new GridLayout(8, 2, 10, 0));

        String [] names = {
                "50000원",       "10000원",       "1000원",        "500원",
                "100원",         "50원",          "10원",          "1원"
        };
        for (int i = 0; i < names.length; ++i) {
            lbs[i] = new JLabel(names[i]);
            lbs[i].setHorizontalAlignment(JLabel.RIGHT);
            tfs[i] = new JTextField(10);
            tfs[i].setHorizontalAlignment(JTextField.CENTER);
            add(lbs[i]);
            add(tfs[i]);
        }
    }
}

class Frame11_03 extends JFrame {
    Frame11_03() {
        setTitle("Money Changer");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel wnd = new JPanel();
        TopPanel11_03 top = new TopPanel11_03();
        BottomPanel11_03 btm = new BottomPanel11_03();

        wnd.add(top);
        wnd.add(btm);

        add(wnd);

        setVisible(true);
    }
}

public class Prob03 {
    public static void main(String [] args) {
        new Frame11_03();
    }
}
