package chap03;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob09 {
    public static void main(String [] args) {
        int sum = 0;
        for (int i = 1; i < args.length; ++i) {
            sum += Integer.parseInt(args[i]);
        }
        int n = args.length - 1;
        double avg = 1. * sum / n;
        System.out.print(avg);
    }
}
