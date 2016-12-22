package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob10_ {
    private static boolean isInt(String x) {
        boolean ret = true;
        for (int i = 0; i < x.length(); ++i) {
            ret &= Character.isDigit(x.charAt(i));
        }
        return ret;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String [] tokens = line.split(" ");
        int sum = 0;
        for (String token : tokens) {
            if (isInt(token)) {
                sum += Integer.parseInt(token);
            }
        }
        System.out.print(sum);
    }
}
