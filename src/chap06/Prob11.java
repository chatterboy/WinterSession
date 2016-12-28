package chap06;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob11 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("가위, 바위, 보 중 하나를 입력하세요>>");
        String user = in.next();
        in.close();
        int i = (int)(Math.random() * 3);
        String enemy = new String("가위바위보").substring(2 * i, 2 * i + 1 + (i == 2 ? 0 : 1));
        System.out.println("컴퓨터>>" + enemy);
        if (user.equals(enemy)) {
            System.out.print("무승부");
        } else {
            if ((user.equals("가위") && enemy.equals("보")) ||
                    (user.equals("바위") && enemy.equals("가위")) ||
                    (user.equals("보") && enemy.equals("바위"))) {
                System.out.print("사용자 승");
            } else {
                System.out.print("컴퓨터 승");
            }
        }
    }
}
