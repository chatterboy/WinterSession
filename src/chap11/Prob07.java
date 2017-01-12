package chap11;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-11.
 */
class Frame11_07 extends JFrame {
    Frame11_07() {
        setTitle("JSlider Practice Frame");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JSlider sd = new JSlider(JSlider.HORIZONTAL, 1, 100, 10);
        JLabel lb = new JLabel("I Love Java");

        sd.setPaintLabels(true);
        sd.setPaintTicks(true);
        sd.setPaintTrack(true);
        sd.setMajorTickSpacing(20);
        sd.setMinorTickSpacing(5);

        lb.setFont(new Font("Arial", Font.PLAIN, 10));
        lb.setHorizontalAlignment(SwingConstants.CENTER);

        sd.addChangeListener((e) -> {
            lb.setFont(new Font("Arial", Font.PLAIN, sd.getValue()));
        });

        add(sd, BorderLayout.NORTH);
        add(lb, BorderLayout.CENTER);

        setVisible(true);
    }
}

public class Prob07 {
    public static void main(String [] args) {
        new Frame11_07();
    }
}
