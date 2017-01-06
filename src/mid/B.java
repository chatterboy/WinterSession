package mid;

import java.util.Scanner;

/**
 * Created by AIServer on 2017-01-06.
 */
public class B {
    private static int find(int iv, int [] ia) {
        int ret = -1;
        for (int i = 0; i < ia.length; ++i) {
            if (ia[i] == iv) {
                ret = i;
                break;
            }
        }
        return ret;
    }
    private static int max(int [] ia) {
        int ret = ia[0];
        for (int i = 1; i < ia.length; ++i) {
            if (ia[i] > ret) {
                ret = ia[i];
            }
        }
        return ret;
    }
    private static int min(int [] ia) {
        int ret = ia[0];
        for (int i = 1; i < ia.length; ++i) {
            if (ia[i] < ret) {
                ret = ia[i];
            }
        }
        return ret;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
        }
        in.close();
        int mna = min(a);
        int mxb = max(b);
        int posa = find(mna, a);
        int posb = find(mxb, b);
        System.out.println(String.valueOf(1 + posa) + " " + String.valueOf(1 + posb));
    }
}
