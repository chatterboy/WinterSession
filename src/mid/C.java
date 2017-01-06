package mid;

import java.util.Scanner;

/**
 * Created by AIServer on 2017-01-06.
 */
public class C {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int d = in.nextInt();
        int v = in.nextInt();
        int w = in.nextInt();
        in.close();
        int now = s;
        int sol = 0;
        int energy = 0;
        while (now != d) {
            if (energy + v < 100) {
                energy += v;
                ++now;
            } else {
                energy -= w;
            }
            ++sol;
        }
        System.out.println(sol);
    }
}
