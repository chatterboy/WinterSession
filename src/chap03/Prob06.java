package chap03;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob06 {
    public static void main(String [] args) {
        int n = 10;
        int [] iarr = new int[n];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < iarr.length; ++i) {
            iarr[i] = in.nextInt();
        }
        Arrays.sort(iarr);
        System.out.print(iarr[0]);
        for (int i = 1; i < iarr.length; ++i) {
            System.out.print(" " + String.valueOf(iarr[i]));
        }
    }
}
