package chap06;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Open {
    public static void main(String [] args) {
        InputStreamReader rd = new InputStreamReader(System.in);
        int [] freq = new int[26];
        try {
            for (;;) {
                int c = rd.read();
                if (c == -1) break;
                if (Character.isLetter(c)) {
                    c = Character.toUpperCase(c);
                    ++freq[c - 'A'];
                }
            }
            rd.close();
        } catch (IOException e) {
            System.out.println("I/O error occurred");
        }
        for (int i = 0; i < 26; ++i) {
            System.out.print((char)(i + 'A'));
            for (int j = 0; j < freq[i]; ++j) {
                System.out.print('-');
            }
            System.out.println();
        }
    }
}
