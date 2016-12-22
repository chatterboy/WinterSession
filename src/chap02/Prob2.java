package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String [] aStr = str.split("-");
        System.out.println(aStr[0]);
    }
}
