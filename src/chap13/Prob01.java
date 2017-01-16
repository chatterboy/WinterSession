package chap13;

/**
 * Created by AIServer on 2017-01-16.
 */
public class Prob01 {
    public static void main(String [] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            for (int i = 1; i <= 100; ++i)
                System.out.println(i);
        });
        th.start();
        th.join();
    }
}
