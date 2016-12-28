package chap06;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob08 {
    public static void main(String [] args) {
        InputStreamReader rd = new InputStreamReader(System.in);
        ArrayList<String> lst = new ArrayList<String>();
        try {
            String str = new String();
            for (;;) {
                int c = rd.read();
                if (c == -1) {
                    if (!str.isEmpty()) {
                        lst.add(str);
                    }
                    break;
                }
                if (c == ' ') {
                    lst.add(str);
                    str = new String();
                }
                if (Character.isLetter(c)) {
                    str += String.valueOf((char)c);
                }
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
        Collections.sort(lst);
        System.out.println(lst.get(lst.size() - 1));
    }
}
