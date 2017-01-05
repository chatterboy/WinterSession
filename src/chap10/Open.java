package chap10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Created by AIServer on 2017-01-05.
 */
class GamePanel extends JPanel {
    JLabel lb1;
    JLabel lb2;
    JLabel lb3;
    JLabel lb4;
    GamePanel() {
        setLayout(null);

        lb1 = new JLabel("0", SwingConstants.CENTER);
        lb2 = new JLabel("0", SwingConstants.CENTER);
        lb3 = new JLabel("0", SwingConstants.CENTER);
        lb4 = new JLabel("시작합니다.");

        lb1.setBackground(Color.MAGENTA);
        lb2.setBackground(Color.MAGENTA);
        lb3.setBackground(Color.MAGENTA);

        lb1.setSize(60, 40);
        lb2.setSize(60, 40);
        lb3.setSize(60, 40);
        lb4.setSize(100, 100);

        lb1.setLocation(50, 50);
        lb2.setLocation(150, 50);
        lb3.setLocation(250, 50);
        lb4.setLocation(150, 100);

        lb1.setFont(new Font("Arial", Font.PLAIN, 30));
        lb2.setFont(new Font("Arial", Font.PLAIN, 30));
        lb3.setFont(new Font("Arial", Font.PLAIN, 30));

        lb1.setForeground(Color.YELLOW);
        lb2.setForeground(Color.YELLOW);
        lb3.setForeground(Color.YELLOW);

        lb1.setOpaque(true);
        lb2.setOpaque(true);
        lb3.setOpaque(true);

        add(lb1);
        add(lb2);
        add(lb3);
        add(lb4);
    }
}

class Frame10_O extends JFrame {
    Frame10_O() {
        setTitle("Open Challenge 10");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);

        GamePanel gp = new GamePanel();

        gp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    GamePanel gp = (GamePanel)e.getSource();
                    int v1 = (int)(Math.random() * 5);
                    int v2 = (int)(Math.random() * 5);
                    int v3 = (int)(Math.random() * 5);
                    if (v1 == v2 && v1 == v3) {
                        gp.lb1.setText(String.valueOf(v1));
                        gp.lb2.setText(String.valueOf(v2));
                        gp.lb3.setText(String.valueOf(v3));
                        gp.lb4.setText("축하합니다!!");
                    } else {
                        gp.lb1.setText(String.valueOf(v1));
                        gp.lb2.setText(String.valueOf(v2));
                        gp.lb3.setText(String.valueOf(v3));
                        gp.lb4.setText("아쉽군요");
                    }
                }
            }
        });

        add(gp);

        setVisible(true);
        gp.requestFocus();
    }
}

public class Open {
    public static void main(String [] args) {
        new Frame10_O();
    }
}
