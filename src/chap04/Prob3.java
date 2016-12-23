package chap04;

/**
 * Created by AIServer on 2016-12-23.
 */
public class Prob3 {
    static class ArrayUtility {
        // int 배열을 double 배열로 변환
        private double [] intToDouble(int [] source) {
            double [] ret = new double[source.length];
            for (int i = 0; i < source.length; ++i) {
                ret[i] = 1. * source[i];
            }
            return ret;
        }
        // double 배열을 int 배열로 변환
        private int [] doubleToInt(double [] source) {
            int [] ret = new int[source.length];
            for (int i = 0; i < source.length; ++i) {
                ret[i] = (int)source[i];
            }
            return ret;
        }
    }
    private static void test(ArrayUtility arrayUtility) {
        int [] ia = { 5, 3, 8, 4, 10 };
        double [] dres = arrayUtility.intToDouble(ia);
        System.out.println("convert int to double");
        System.out.print(dres[0]);
        for (int i = 1; i < dres.length; ++i) {
            System.out.print(" " + dres[i]);
        }
        System.out.println();
        double [] da = { 3.5, 1.2, 9.8, 4.2, 1.2 };
        int [] ires = arrayUtility.doubleToInt(da);
        System.out.println("convert double to int");
        System.out.print(ires[0]);
        for (int i = 1; i < ires.length; ++i) {
            System.out.print(" " + ires[i]);
        }
    }
    public static void main(String [] args) {
        ArrayUtility arrayUtility = new ArrayUtility();
        test(arrayUtility);
    }
}
