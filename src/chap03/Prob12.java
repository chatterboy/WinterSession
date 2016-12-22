package chap03;

/**
 * Created by AIServer on 2016-12-22.
 */
public class Prob12 {
    private static boolean is369(int x) {
        boolean ret = false;
        while (x != 0) {
            int rem = x % 10;
            ret |= (rem == 3 || rem == 6 || rem == 9);
            x /= 10;
        }
        return ret;
    }
    private static int count(int x) {
        int ret = 0;
        while (x != 0) {
            int rem = x % 10;
            ret += (rem == 3 || rem == 6 || rem == 9) ? 1 : 0;
            x /= 10;
        }
        return ret;
    }
    public static void main(String [] args) {
        String [] claps = { "한번", "두번" };
        for (int x = 1; x < 100; ++x) {
            if (is369(x)) {
                int numOfClaps = count(x);
                System.out.println(String.valueOf(x) + " " +
                                    "박수 " +
                                    claps[numOfClaps - 1]);
            }
        }
    }
}
