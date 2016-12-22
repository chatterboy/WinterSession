package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob02 {
    private static int ctoi(char ch) {
        int tmp = Character.isLowerCase(ch) ? 'a' : 'A';
        return ch - tmp;
    }
    public static void main(String [] args) {
        System.out.print("알파벳 한 문자를 입력하시오>>");
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        int n = ctoi(ch);
        for (int i = 0; i <= n; ++i) {
            for (int j = 0; j <= n-i; ++j) {
                System.out.print((char)((Character.isLowerCase(ch) ? 'a' : 'A') + j));
            }
            System.out.println();
        }
    }
}
