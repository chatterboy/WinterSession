package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-12.
 */
class Button11_O extends JButton {
    int id;
    Button11_O(int id, ImageIcon ii) {
        super(ii);
        this.id = id;
    }
}

class MenuPanel extends JPanel {
    static String [] PATHS = {
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/left.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/right.png"
    };
    static String [] PATHS2 = {
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/1.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/2.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/3.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/4.png"
    };
    int now = 0;
    Button11_O [] btns = new Button11_O[2];
    MenuPanel(JLabel lb) {
        setLayout(new FlowLayout());
        setBackground(Color.GRAY);

        for (int i = 0; i < btns.length; ++i) {
            btns[i] = new Button11_O(i, new ImageIcon(PATHS[i]));

            btns[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int next = now;
                    Button11_O btn = (Button11_O) e.getSource();
                    if (btn.id == 0) {
                        --next;
                        next += 4;
                        next %= 4;
                    } else {
                        ++next;
                        next %= 4;
                    }
                    now = next;
                    lb.setIcon(new ImageIcon(PATHS2[now]));
                }
            });
        }

        for (int i = 0; i < btns.length; ++i)
            add(btns[i]);

        setVisible(true);
    }
}

class Frame11_O extends JFrame {
    Frame11_O() {
        setTitle("좌우로 이미지 넘기기");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel lb = new JLabel(new ImageIcon(MenuPanel.PATHS2[0]));
        MenuPanel mp = new MenuPanel(lb);

        add(lb, BorderLayout.CENTER);
        add(mp, BorderLayout.SOUTH);

        setVisible(true);
    }
}

public class Open {
    public static void main(String [] args) {
        new Frame11_O();
    }
}
