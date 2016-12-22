package chap03;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob10 {

    private static boolean isInt(String x) {
        boolean ret = true;
        for (int i = 0; i < x.length(); ++i) {
            ret &= Character.isDigit(x.charAt(i));
        }
        return ret;
    }
    public static void main(String [] args) {
        int sum = 0;
        for (int i = 1; i < args.length; ++i) {
            if (isInt(args[i])) {
                sum += Integer.parseInt(args[i]);
            }
        }
        System.out.print(sum);
    }
}
