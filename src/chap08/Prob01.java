package chap08;

import java.io.File;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob01 {
    public static void main(String [] args) {
        File file = new File("C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/a.jpg");
        System.out.print(file.length());
    }
}
