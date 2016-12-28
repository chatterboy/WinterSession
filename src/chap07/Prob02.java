package chap07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob02 {
    public static void main(String [] args) {
        ArrayList<Character> lst = new ArrayList<Character>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; ++i) {
            Character ch = in.next().charAt(0);
            lst.add(ch);
        }
        in.close();
        for (int i = 0; i < lst.size(); ++i) {
            int p = lst.get(i) - 'A';
            p -= lst.get(i) == 'F' ? 1 : 0;
            String res = new String("4.03.02.01.00").substring(3 * p, 3 * p + 3 + (lst.get(i) == 'F' ? -2 : 0));
            System.out.println(res);
        }
    }
}
