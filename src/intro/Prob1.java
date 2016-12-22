package intro;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob1 {
    private static int find(int mx, int [] sums) {
        int ret = -1;
        for (int i = 0; i < sums.length; ++i) {
            if (sums[i] == mx) {
                ret = i;
                break;
            }
        }
        return ret;
    }
    private static int max(int [] sums) {
        int ret = sums[0];
        for (int i = 1; i < sums.length; ++i) {
            if (sums[i] > ret) {
                ret = sums[i];
            }
        }
        return ret;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] sums = new int[n];
        for (int i = 0; i < sums.length; ++i) {
            int m = in.nextInt();
            int sum = 0;
            for (int j = 0; j < m; ++j) {
                int aj = in.nextInt();
                sum += aj;
            }
            sums[i] = sum;
        }
        int mx = max(sums);
        int sol = find(mx, sums);
        System.out.print(sol + 1);
    }
}
