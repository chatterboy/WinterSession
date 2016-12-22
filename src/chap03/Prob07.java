package chap03;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob07 {
    public static void main(String [] args) {
        int n = 4;
        int [][] mat = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                mat[i][j] = (int)Math.round(Math.random() * 9 + 1);
            }
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(mat[i][0]);
            for (int j = 0; j < n; ++j) {
                System.out.print(" " + String.valueOf(mat[i][j]));
            }
            System.out.println();
        }
    }
}
