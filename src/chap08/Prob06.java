package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob06 {
    public static void main(String [] args) throws FileNotFoundException {
        FileInputStream fin = new FileInputStream("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/Prob06.java");
        try {
            for (int c, pc = 0, n = 0; (c = fin.read()) != -1; ) {
                char ch = (char)c;
                if (n == 0 || (char)pc == '\n') {
                    System.out.print(++n);
                    System.out.print(' ');
                }
                System.out.print(ch);
                pc = c;
            }
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
    }
}
