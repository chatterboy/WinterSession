package chap06;

/**
 * Created by AIServer on 2016-12-28.
 */

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        String ret = new String();
        ret += "MyPoint";
        ret += "(";
        ret += String.valueOf(x);
        ret += ",";
        ret += String.valueOf(y);
        ret += ")";
        return ret;
    }
}

public class Prob01 {
    public static void main(String [] args) {
        MyPoint a = new MyPoint(3, 20);
        System.out.println(a);
    }
}
