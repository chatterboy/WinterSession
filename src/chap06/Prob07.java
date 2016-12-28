package chap06;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob07 {
    public static void main(String [] args) {
        InputStreamReader rd = new InputStreamReader(System.in);
        ArrayList<String> sol = new ArrayList<String>();
        try {
            String str = new String();
            while (true) {
                int c = rd.read();
                if (c == -1) {
                    if (!str.isEmpty()) {
                        sol.add(str);
                    }
                    break;
                }
                if (c == ' ') {
                    sol.add(str);
                    str = new String();
                }
                if (c != '\n' && Character.isLetter(c)) {
                    str += String.valueOf((char)c);
                }
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
        for (String e : sol) {
            System.out.println(e);
        }
        System.out.println(sol.size());
    }
}
