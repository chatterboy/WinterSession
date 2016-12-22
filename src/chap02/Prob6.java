package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob6 {
    public static boolean isLeafYr(int yr) {
        if (yr % 4 == 0) {
            if (yr % 100 == 0) {
                if (yr % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
    public static boolean isLeafYr_(int yr) {
        return yr % 4 == 0 && ((yr % 100 != 0) || (yr % 400 == 0));
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int yr = Integer.parseInt(in.next());
        if (isLeafYr_(yr)) {
            System.out.print("윤년입니다");
        } else {
            System.out.print("윤년이 아닙니다");
        }
    }
}
