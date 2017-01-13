package chap12;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Created by AIServer on 2017-01-13.
 */
class Label12_3 extends JLabel {
    int x, y, w, h;
    Label12_3(int x, int y, int w, int h, ImageIcon ii) {
        super(ii);
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        setLocation(x, y);
        setSize(w, h);

        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();

                update(x, y);
            }
        });
    }
    void update(int x, int y) {
        this.x = x;
        this.y = y;
        setLocation(x - 50, y - 50);
    }
}

class Frame12_3 extends JFrame {
    Frame12_3() {
        setTitle("이미지 레이블 드래깅 연습");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        Label12_3 lb = new Label12_3(50, 50, 100, 100, new ImageIcon("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap12/apple.png"));

        add(lb);

        setVisible(true);
    }
}

public class Prob3 {
    public static void main(String [] args) {
        new Frame12_3();
    }
}
