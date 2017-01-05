package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;

/**
 * Created by AIServer on 2017-01-05.
 */
class Frame11_01 extends JFrame {
    Frame11_01() {
        setTitle("CheckBox Practice...");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        JCheckBox active = new JCheckBox("버튼 비활성화");
        JCheckBox show = new JCheckBox("버튼 감추기");
        JButton btn = new JButton("test button");

        active.addItemListener((e) -> {
            int selected = e.getStateChange() == ItemEvent.SELECTED ? 1 : -1;
            active.getRootPane().getContentPane().getComponent(2).setEnabled(selected == -1);
        });
        show.addItemListener((e) -> {
            int selected = e.getStateChange() == ItemEvent.SELECTED ? 1 : -1;
            show.getRootPane().getContentPane().getComponent(2).setVisible(selected == -1);
        });

        add(active);
        add(show);
        add(btn);

        setVisible(true);
    }
}

public class Prob01 {
    public static void main(String [] args) {
        new Frame11_01();
    }
}
