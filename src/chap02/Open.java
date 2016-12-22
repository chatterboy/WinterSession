package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Open {
    public static void main(String [] args) {
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        Scanner in = new Scanner(System.in);
        System.out.print("철수 >> ");
        String lhs = in.next();
        System.out.print("영희 >> ");
        String rhs = in.next();
        if (lhs.equals(rhs)) {
            System.out.print("무승부입니다");
        } else {
            if ((lhs.equals("가위") && rhs.equals("보")) ||
                    (lhs.equals("바위") && rhs.equals("가위")) ||
                    (lhs.equals("보") && rhs.equals("바위"))) {
                System.out.print("철수가 이겼습니다");
            } else {
                System.out.print("영희가 이겼습니다");
            }
        }
    }
}
