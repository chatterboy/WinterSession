package chap05;

/**
 * Created by AIServer on 2016-12-27.
 */

class CPoint {
    int x;
    int y;
    CPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void show() {
        System.out.println("(" + String.valueOf(x) + "," + String.valueOf(y) + ")");
    }
    void show(String c) {
        System.out.println("(" + String.valueOf(x) + "," + String.valueOf(y) + ") " + c);
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        String newline = System.getProperty("line.separator");
        res.append("(");
        res.append(this.x);
        res.append(",");
        res.append(this.y);
        res.append(")");
        res.append("입니다.");
        return res.toString();
    }
}

class CColorPoint extends CPoint {
    String c;
    CColorPoint(int x, int y, String c) {
        super(x, y);
        this.c = c;
    }
    @Override
    void show() {
        super.show(c);
    }
}

public class Prob4 {
    public static void main(String [] args) {
        CPoint a, b;
        a = new CPoint(2, 3);
        b = new CColorPoint(3, 4, "red");
        a.show();
        b.show();
        System.out.println(a);
        System.out.println(b);
    }
}
