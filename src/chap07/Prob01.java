package chap07;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob01 {
    public static void main(String [] args) {
        Vector<Integer> v = new Vector<Integer>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            v.add(in.nextInt());
        }
        in.close();
        Integer res = Collections.max(v);
        System.out.print(res);
    }
}
