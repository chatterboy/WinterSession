package chap08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob05 {
    public static void main(String [] args) throws FileNotFoundException {
        FileInputStream in1 = new FileInputStream("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/prob05-1.txt");
        FileInputStream in2 = new FileInputStream("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/prob05-2.txt");
        try {
            File f1 = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/prob05-1.txt");
            File f2 = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/prob05-2.txt");
            int same = f1.length() != f2.length() ? 0 : -1;
            for (int c1, c2; (c1 = in1.read()) != -1 && (c2 = in2.read()) != -1; ) {
                char ch1 = (char)c1;
                char ch2 = (char)c2;
                same = same == -1 ? 1 : same;
                same &= ch1 == ch2 ? 1 : 0;
            }
            if (same == 1) System.out.println("tow files are same");
            else System.out.println("two files are different");
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
    }
}
