package chap02;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob5 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] lens = new int[3];
        for (int i = 0; i < 3 && in.hasNext(); ++i) {
            lens[i] = Integer.parseInt(in.next());
        }
        Arrays.sort(lens);
        if (lens[2] < lens[0] + lens[1]) {
            System.out.print("삼각형 만들 수 있음");
        } else {
            System.out.print("삼각형 만들 수 없음");
        }
    }
}
