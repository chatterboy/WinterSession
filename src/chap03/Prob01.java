package chap03;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob01 {
    public static void main(String [] args) {
        System.out.print("임의의 정수를 입력하시오>>");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; ++i) {           // i-번째 줄에 대해서
            for (int j = 0; j < n-i; ++j) {     // n-i개의 별을 출력한다.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
