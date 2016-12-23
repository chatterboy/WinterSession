package chap04;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by AIServer on 2016-12-23.
 */
public class Prob4 {
    static class ArrayUtility2 {
        static int [] concat(int [] s1, int [] s2) {
            int [] ret = new int[s1.length + s2.length];
            for (int i = 0; i < s1.length; ++i) {
                ret[i] = s1[i];
            }
            for (int i = s1.length; i < s1.length + s2.length; ++i) {
                ret[i] = s2[i - s1.length];
            }
            return ret;
        }
        static int [] remove(int [] s1, int [] s2) {
            ArrayList<Integer> lst = new ArrayList<Integer>();
            for (int i = 0; i < s1.length; ++i) {
                boolean found = false;
                for (int j = 0; j < s2.length; ++j) {
                    found |= s1[i] == s2[j];
                }
                if (!found) {
                    lst.add(s1[i]);
                }
            }
            int [] ret = new int[lst.size()];
            for (int i = 0; i < lst.size(); ++i) {
                ret[i] = lst.get(i);
            }
            return ret;
        }
    }
    private static void test(ArrayUtility2 arrayUtility2) {
        int [] s1 = { 6, 3, 1, 7, 4 };
        int [] s2 = { 1, 9, 10, 2, 4 };
        System.out.println("concat() test");
        int [] res = arrayUtility2.concat(s1, s2);
        System.out.print(res[0]);
        for (int i = 1; i < res.length; ++i) {
            System.out.print(" " + String.valueOf(res[i]));
        }
        System.out.println();
        System.out.println("remove() test");
        res = arrayUtility2.remove(s1, s2);
        System.out.print(res[0]);
        for (int i = 1; i < res.length; ++i) {
            System.out.print(" " + String.valueOf(res[i]));
        }
    }
    public static void main(String [] args) {
        ArrayUtility2 arrayUtility2 = new ArrayUtility2();
        test(arrayUtility2);
    }
}
