package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob1 {
    private static boolean isAlphabet(char ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        if (!isAlphabet(ch)) {
            System.out.println("영문자가 아닙니다.");
        } else {
            ch = Character.isUpperCase(ch) ? Character.toLowerCase(ch) : Character.toUpperCase(ch);
            System.out.println(ch);
        }
    }
}
