package chap10;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.KeyAdapter;
        import java.awt.event.KeyEvent;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;

/**
 * Created by AIServer on 2017-01-02.
 */
class MyFrame10_3 extends JFrame {
    MyFrame10_3() {
        setTitle("Left 키로 문자열 ...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = getContentPane();
        con.setLayout(new FlowLayout());

        JLabel lb = new JLabel("Love Java");
        lb.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) {
                    JLabel lb = (JLabel)e.getSource();
                    StringBuffer sb = new StringBuffer(lb.getText());
                    sb = sb.reverse();
                    lb.setText(sb.toString());
                }
            }
        });

        con.add(lb);

        setSize(400, 400);
        setVisible(true);
        lb.requestFocus();
    }
}

public class Prob3 {
    public static void main(String [] args) {
        new MyFrame10_3();
    }
}
