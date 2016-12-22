package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob04 {
    private static int gcd(int a, int b) {
        if (a < b) {                                // primitive type is only call by value
            // swap with a and b
            int tmp = a;
            a = b;
            b = tmp;
        }
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int g = gcd(a, b);
        System.out.print(g);
    }
}
