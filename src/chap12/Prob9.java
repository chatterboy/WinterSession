package chap12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AIServer on 2017-01-13.
 */
class TopPanel12_9 extends JPanel {
    TopPanel12_9() {

    }
}

class MidPanel12_9 extends JPanel {
    MidPanel12_9() {

    }
}

class BtmPanel12_9 extends JPanel {
    BtmPanel12_9() {

    }
}

class Frame12_9 extends JFrame {
    Frame12_9() {
        setTitle("파이 차트 그리기");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 1));

        TopPanel12_9 top = new TopPanel12_9();
        MidPanel12_9 mid = new MidPanel12_9();
        BtmPanel12_9 btm = new BtmPanel12_9();

        add(top);
        add(mid);
        add(btm);

        setVisible(true);
    }
}

public class Prob9 {
    public static void main(String [] args) {
        new Frame12_9();
    }
}
