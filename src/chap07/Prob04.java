package chap07;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by AIServer on 2016-12-28.
 */
public class Prob04 {
    public static void main(String [] args) {
        ArrayList<Double> lst = new ArrayList<Double>();
        for (int i = 0; i < 20; ++i) {
            double dx = Math.random() * 100;
            lst.add(dx);
        }
        Iterator<Double> iterator = lst.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
