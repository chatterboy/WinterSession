package chap08;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob07 {
    public static void main(String [] args) throws FileNotFoundException {
        File src = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/a.jpg");
        File des = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/b.jpg");
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(des);
        try {
            int n = 0;
            byte [] data = new byte[1000];
            for (int c; (c = fis.read()) != -1; ) {
                data[n++] = (byte) c;
                if (n == data.length) {
                    fos.write(data);
                    n = 0;
                    data = new byte[1000];
                }
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
    }
}
