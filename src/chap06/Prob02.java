package chap06;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob02 {
    public static void main(String [] args) {
        for (int i = 0; i < 10; ++i) {
            // Math.random() generate a double number in [0.0, 1.0)
            int x = (int)(Math.random() * 41) + 10;
            System.out.println(x);
        }
    }
}
