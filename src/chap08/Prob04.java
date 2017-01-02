package chap08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by AIServer on 2017-01-02.
 */
public class Prob04 {
    public static void main(String [] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String name1 = in.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String name2 = in.next();
        String newName = name1 + name2;
        newName = "C:/Users/AIServer/IdeaProjects/WinterSession/data/chap08/" + newName + ".txt";
        File file = new File(newName);
        FileWriter fw = new FileWriter(file);
        fw.close();
        in.close();
    }
}
