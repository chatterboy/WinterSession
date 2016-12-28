package chap07;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob03 {
    public static void main(String [] args) {
        HashMap<String, Integer> nations = new HashMap<String, Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            System.out.print("나라 이름을 입력하세요>>");
            String name = in.next();
            System.out.print("인구를 입력하세요>>");
            int pop = in.nextInt();
            nations.put(name, pop);
        }
        System.out.print("검색할 나라 이름을 입력하세요>>");
        String name = in.next();
        System.out.print(name + " " + nations.get(name));
        in.close();
    }
}
