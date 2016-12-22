package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob05 {
    public static void main(String [] args) {
        int n = 10;
        int [] iarr = new int[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; ++i) {
            iarr[i] = in.nextInt();
        }
        for (int elem : iarr) {
            if (elem % 3 == 0) {
                System.out.println(elem);
            }
        }
    }
}
