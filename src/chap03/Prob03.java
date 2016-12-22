package chap03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob03 {
    private static ArrayList<Integer> binary(int x) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (x == 0) {
            ret.add(0);
        } else {
            while (x != 0) {
                ret.add(x % 2);
                x /= 2;
            }
        }
        return ret;
    }
    private static int count(ArrayList<Integer> lst) {
        int ret = 0;
        for (Integer elem : lst) {
            ret += elem;
        }
        return ret;
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        ArrayList<Integer> lst = binary(x);
        Collections.reverse(lst);
        int numOfOnes = count(lst);
        for (Integer elem : lst) {
            System.out.print(elem);
        }
        System.out.println();
        System.out.print(numOfOnes);
    }
}
