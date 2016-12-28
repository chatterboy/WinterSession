package chap06;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob06 {
    public static void main(String [] args) {
        InputStreamReader rd = new InputStreamReader(System.in);
        int numOfCapitals = 0;
        try {
            while (true) {
                int c = rd.read();
                if (c == -1) break;                     // Linux: Ctrl + d, Windows: Ctrl + z   (but i am not sure :D)
                if (c == '\n') continue;                // Linux: \n,       Windows: \n\r       (you know what i want to say...)
                if (Character.isUpperCase(c)) {
                    ++numOfCapitals;
                }
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
        System.out.println(numOfCapitals);
    }
}
