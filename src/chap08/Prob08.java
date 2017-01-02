package chap08;

import java.io.*;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob08 {
    public static void main(String [] args) throws FileNotFoundException {
        File src = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/a.jpg");
        File des = new File("C:/Users/AIserver/IdeaProjects/WinterSession/data/chap08/b.jpg");
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(des);
        long n = src.length();
        try {
            int k = 0;
            long i = 1;
            for (int c; (c = fis.read()) != -1; ++i) {
                if (1. * i / n > 0.1 * k) {
                    System.out.print('*');
                    ++k;
                }
                byte data = (byte) c;
                fos.write(data);
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
    }
}
