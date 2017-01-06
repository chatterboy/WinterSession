package mid;

import java.util.Scanner;

/**
 * Created by AIServer on 2017-01-06.
 */
public class A {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [] joos = new String[n];
        for (int i = 0; i < n; ++i) {
            joos[i] = in.next();
        }
        in.close();
        int sol = 100000000;
        for (String joo : joos) {
            int m = joo.length();
            int h;
            for (h = 0; h < m && joo.charAt(h) != '|'; ++h);
            if (sol > h) {
                sol = h;
            }
        }
        System.out.println(sol);
    }
}
