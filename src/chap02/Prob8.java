package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob8 {
    public static void main(String [] args) {
        System.out.print("두 점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if (x1 > 100 || x2 < 50 || y1 > 100 || y2 < 50) {
            System.out.print("사각형이 겹치지 않습니다");
        } else {
            System.out.print("사각형이 겹칩니다");
        }
    }
}
