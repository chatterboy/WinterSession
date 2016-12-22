package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob3 {
    public static void main(String [] args) {
        int [] coins = {
                50000,      10000,      1000,       500,
                100,        50,         10,         1
        };
        int [] res = new int[coins.length];
        Scanner in = new Scanner(System.in);
        int money = in.nextInt();
        for (int i = 0; i < coins.length; ++i) {
            res[i] = money / coins[i];
            money = money % coins[i];
        }
        for (int i = 0; i < res.length; ++i) {
            System.out.println(String.valueOf(coins[i]) + "원: " + String.valueOf(res[i]));
        }
    }
}
