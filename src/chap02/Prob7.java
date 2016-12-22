package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob7 {
    public static void main(String [] args) {
        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if ((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
            System.out.print("사각형 안에 점이 있습니다");
        } else {
            System.out.print("사각형 안에 점이 없습니다");
        }
    }
}
