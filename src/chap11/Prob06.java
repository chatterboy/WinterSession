package chap11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-11.
 */
class Frame11_06 extends JFrame {
    Frame11_06() {
        setTitle("JSlider Practice Frame");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JSlider sd = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
        JLabel lb = new JLabel("100");

        sd.setPaintLabels(true);
        sd.setPaintTicks(true);
        sd.setPaintTrack(true);
        sd.setMajorTickSpacing(50);
        sd.setMinorTickSpacing(10);

        lb.setBackground(Color.GREEN);
        lb.setOpaque(true);

        sd.addChangeListener((e) -> {
            lb.setText(String.valueOf(sd.getValue()));
        });

        add(sd);
        add(lb);

        setVisible(true);
    }
}

public class Prob06 {
    public static void main(String [] args) {
        new Frame11_06();
    }
}
