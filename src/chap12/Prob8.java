package chap12;

import com.sun.javafx.iio.ImageStorage;
import com.sun.javafx.iio.ImageStorage.ImageType;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.Raster;

import static com.sun.javafx.iio.ImageStorage.ImageType.RGB;

/**
 * Created by AIServer on 2017-01-13.
 */
class Panel12_8 extends JPanel {
    ImageIcon ii;
    Image img;
    Panel12_8() {
        ii = new ImageIcon("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap12/1.png");
        img = ii.getImage();
    }
    BufferedImage toBufferedImage(Image img) {
        if (img instanceof BufferedImage) {
            return (BufferedImage) img;
        }
        BufferedImage bimg = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics2D bGr = bimg.createGraphics();
        bGr.drawImage(img, 0, 0, null);
        bGr.dispose();
        return bimg;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = img.getWidth(null);
        int h = img.getHeight(null);


        g.drawImage(img, 0, 0, w, h, null);
    }
}

class Frame12_8 extends JFrame {
    Frame12_8() {
        setTitle("그래픽 이미지 연습");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Panel12_8 pnl = new Panel12_8();

        add(pnl);

        setVisible(true);
    }
}

public class Prob8 {
    public static void main(String [] args) {
        new Frame12_8();
    }
}
