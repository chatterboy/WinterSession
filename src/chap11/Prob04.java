package chap11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-05.
 */
class TopPanel11_04 extends JPanel {
    JLabel lb;
    JTextField tf;
    JButton btn;
    TopPanel11_04() {
        setLayout(new FlowLayout());

        lb = new JLabel("금액");
        tf = new JTextField(15);
        btn = new JButton("계산");

        btn.addActionListener((e) -> {
            JPanel root = (JPanel) this.getRootPane().getContentPane().getComponent(0);
            BottomPanel11_04 pnl = (BottomPanel11_04) root.getComponent(1);

            int money = Integer.parseInt(tf.getText());

            for (int i = 0; i < BottomPanel11_04.PRICES.length; ++i) {
                pnl.tfs[i].setText(String.valueOf(money / BottomPanel11_04.PRICES[i]));
                money %= BottomPanel11_04.PRICES[i];
            }
        });

        add(lb);
        add(tf);
        add(btn);
    }
}

class BottomPanel11_04 extends JPanel {
    static String [] NAMES = {
            "50000원",       "10000원",       "1000원",        "500원",
            "100원",         "50원",          "10원",          "1원"
    };
    static int [] PRICES = {
            50000,          10000,          1000,           500,
            100,            50,             10,             1
    };
    JLabel [] lbs = new JLabel[8];
    JTextField [] tfs = new JTextField[8];
    JCheckBox [] cbs = new JCheckBox[7];
    BottomPanel11_04() {
        setLayout(new GridLayout(8, 3, 10, 0));

        for (int i = 0; i < lbs.length; ++i) {
            lbs[i] = new JLabel(NAMES[i]);
            lbs[i].setHorizontalAlignment(JLabel.RIGHT);
            tfs[i] = new JTextField(10);
            tfs[i].setHorizontalAlignment(JTextField.RIGHT);
            if (i < lbs.length - 1) {
                cbs[i] = new JCheckBox();
            }

            if (i < lbs.length - 1) {
                cbs[i].addActionListener((e) -> {
                    JCheckBox cb = (JCheckBox) e.getSource();
                    for (int j = 0; j < cbs.length; ++j) {
                        if (cbs[j] == cb) {
                            int plus = Integer.parseInt(tfs[j].getText()) * PRICES[j];
                            tfs[j].setText("0");
                            String res = String.valueOf(Integer.parseInt(tfs[tfs.length - 1].getText()) + plus);
                            tfs[tfs.length - 1].setText(res);
                        }
                    }
                });
            }

            add(lbs[i]);
            add(tfs[i]);
            if (i < lbs.length - 1) add(cbs[i]);
        }
    }
}

class Frame11_04 extends JFrame {
    Frame11_04() {
        setTitle("Money Changer with Check...");
        setSize(350, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel wnd = new JPanel();
        TopPanel11_04 top = new TopPanel11_04();
        BottomPanel11_04 btm = new BottomPanel11_04();

        wnd.add(top);
        wnd.add(btm);

        add(wnd);

        setVisible(true);
    }
}

public class Prob04 {
    public static void main(String [] args) {
        new Frame11_04();
    }
}
