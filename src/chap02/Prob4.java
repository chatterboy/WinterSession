package chap02;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob4 {
    public static void main(String [] args) {
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int bNum = num;
        int numOfClaps = 0;
        while (num != 0) {
            int rem = num % 10;
            numOfClaps += (rem == 3) || (rem == 6) || (rem == 9) ? 1 : 0;
            num /= 10;
        }
        num = bNum;
        if (numOfClaps == 0) {
            System.out.print(num);
        } else {
            System.out.print("박수");
            for (int i = 0; i < numOfClaps; ++i) {
                System.out.print("짝");
            }
        }
    }
}
