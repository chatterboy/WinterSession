package chap03;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Open {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        for (;;) {
            Random rnd = new Random();
            int x = rnd.nextInt(100);
            System.out.println("수를 결정하였습니다. 맞추어 보세요.");
            int lo = 0;
            int hi = 99;
            for (int i = 1;; ++i) {
                System.out.println(String.valueOf(lo) + "-" + String.valueOf(hi));
                System.out.print(String.valueOf(i) + ">>");
                int num = in.nextInt();
                if (num == x) {
                    System.out.println("맞았습니다.");
                    break;
                } else if (num > x) {
                    System.out.println("더 낮게");
                    hi = num;
                } else {
                    System.out.println("더 높게");
                    lo = num;
                }
            }
            System.out.print("다시하시겠습니까(y/n)>>");
            char re = in.next().charAt(0);
            if (re == 'n') {
                break;
            }
        }
        in.close();
    }
}
