package chap03;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob09_ {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String [] tokens = line.split(" ");
        in.close();
        int sum = 0;
        for (String token : tokens) {
            sum += Integer.parseInt(token);
        }
        int n = tokens.length;
        double avg = 1. * sum / n;
        System.out.print((int)avg);
    }
}
