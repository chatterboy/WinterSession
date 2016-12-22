package chap03;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob08 {
    public static void main(String [] args) {
        int n = 4;
        int [][] mat = new int[n][n];
        for (int numOfInts = 0; numOfInts < 8; ++numOfInts) {
            int x = (int)Math.round(Math.random() * 9 + 1);
            int i, j;
            do {
                i = (int)Math.round(Math.random() * 3);
                j = (int)Math.round(Math.random() * 3);
            } while (mat[i][j] != 0);
            mat[i][j] = x;
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(mat[i][0]);
            for (int j = 1; j < n; ++j) {
                System.out.print(" " + String.valueOf(mat[i][j]));
            }
            System.out.println();
        }
    }
}
