package chap11;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-11.
 */
class Frame11_08 extends JFrame {
    Frame11_08() {
        setTitle("TextArea Practice Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea(10, 10);
        JSlider sd = new JSlider(JSlider.HORIZONTAL, 0, 100, 0);

        ta.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Document doc = e.getDocument();
                sd.setValue(doc.getLength());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                Document doc = e.getDocument();
                sd.setValue(doc.getLength());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });
        ta.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 8) ta.setEditable(true);
            }
        });
        sd.addChangeListener((e) -> {
            if (sd.getValue() >= 99) ta.setEditable(false);
        });

        sd.setEnabled(false);

        sd.setPaintLabels(true);
        sd.setPaintTicks(true);
        sd.setPaintTrack(true);
        sd.setMajorTickSpacing(20);
        sd.setMinorTickSpacing(5);

        add(new JScrollPane(ta), BorderLayout.NORTH);
        add(sd, BorderLayout.CENTER);

        setVisible(true);
    }
}

public class Prob08 {
    public static void main(String [] args) {
        new Frame11_08();
    }
}
