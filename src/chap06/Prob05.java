package chap06;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob05 {
    public static void main(String [] args) {
        String line = "They is students.";
        String [] words = line.split(" ");
        for (int i = 0; i < words.length; ++i) {
            if (words[i].equals("is")) {
                words[i] = "are";
            }
        }
        String sol = new String();
        sol += words[0];
        for (int i = 1; i < words.length; ++i) {
            sol += " ";
            sol += words[i];
        }
        System.out.println(sol);
    }
}
