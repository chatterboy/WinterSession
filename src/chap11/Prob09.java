package chap11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-12.
 */
class GameButton11_09 extends JButton {
    int id;
    GameButton11_09(ImageIcon ii, int id) {
        super(ii);
        this.id = id;
    }
}

class Player {
    int id;
    Player(int id) {
        this.id = id;
    }
}

class TopPanel11_09 extends JPanel {
    static String [] PATHS = {
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/scissors.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/rock.png",
            "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap11/paper.png"
    };
    static String [] NAMES = { "가위", "바위", "보" };
    GameButton11_09 [] btns = new GameButton11_09[3];
    TopPanel11_09(Player [] players, BottomPanel11_09 bottom) {
        setLayout(new FlowLayout());
        setBackground(Color.GRAY);

        for (int i = 0; i < NAMES.length; ++i) {
            btns[i] = new GameButton11_09(new ImageIcon(PATHS[i]), i);

            btns[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    GameButton11_09 btn = (GameButton11_09) e.getSource();
                    players[0] = new Player(btn.id);
                    players[1] = new Player((int) (Math.random() * 3));

                    bottom.update(players);
                }
            });

            add(btns[i]);
        }


        setVisible(true);
    }
}

class BottomPanel11_09 extends JPanel {
    JLabel [] lbs = new JLabel[3];
    BottomPanel11_09() {
        setLayout(new FlowLayout());
        setBackground(Color.YELLOW);

        lbs[0] = new JLabel("me");
        lbs[1] = new JLabel("com");
        lbs[2] = new JLabel("start");

        lbs[2].setForeground(Color.RED);

        for (int i = 0; i < lbs.length; ++i) {
            add(lbs[i]);
        }

        setVisible(true);
    }
    void update(Player [] players) {
        lbs[0].setIcon(new ImageIcon(TopPanel11_09.PATHS[players[0].id]));
        lbs[1].setIcon(new ImageIcon(TopPanel11_09.PATHS[players[1].id]));

        String me = TopPanel11_09.NAMES[players[0].id];
        String com = TopPanel11_09.NAMES[players[1].id];

        if (me.equals(com)) lbs[2].setText("Same !!!!");
        else {
            if ((me.equals("가위") && com.equals("보")) ||
                    (me.equals("바위") && com.equals("가위"))||
                    (me.equals("보") && com.equals("바위"))) {
                lbs[2].setText("me !!!");
            } else {
                lbs[2].setText("Computer !!!");
            }
        }
    }
}

class Frame11_09 extends JFrame {
    Frame11_09() {
        setTitle("가위 바위 보 게임");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(2, 1));

        Player [] players = new Player[2];

        BottomPanel11_09 bottom = new BottomPanel11_09();
        TopPanel11_09 top = new TopPanel11_09(players, bottom);

        add(top);
        add(bottom);

        setVisible(true);
    }
}

public class Prob09 {
    public static void main(String [] args) {
        new Frame11_09();
    }
}
