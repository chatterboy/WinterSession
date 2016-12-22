package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob11 {
    public static void main(String [] args) {
        int [] units = {
                50000,      10000,      1000,       500,
                100,        50,         10,         1
        };
        int [] res = new int[units.length];
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        for (int i = 0; i < units.length; ++i) {
            res[i] = money / units[i];
            money %= units[i];
        }
        for (int i = 0; i < res.length; ++i) {
            System.out.println(String.valueOf(units[i]) + "원: " + String.valueOf(res[i]));
        }
    }
}
