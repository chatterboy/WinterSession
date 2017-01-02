package chap08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob02 {
    public static void main(String [] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/prob02.txt");
        try {
            int c;
            for (; (c = in.read()) != -1;) {
                char ch = (char)c;
                if (Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
            }
            in.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
    }
}
