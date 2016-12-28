package chap05;

/**
 * Created by AIServer on 2016-12-28.
 */

abstract class MyPoint {
    int x;
    int y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    protected abstract void move(int x, int y);
    protected abstract void reverse();
    protected void show() {
        System.out.println(x + "," + y);
    }
}

class MyColorPoint extends MyPoint {
    String color;
    MyColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
    @Override
    protected void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    protected void reverse() {
        int tmp = x;
        x = y;
        y = tmp;
    }
    @Override
    protected void show() {
        System.out.println(x + "," + y + "," + color);
    }
}

public class Prob5 {
    public static void main(String [] args) {
        MyPoint p = new MyColorPoint(2, 3, "blue");
        p.move(3, 4);
        p.reverse();
        p.show();
    }
}
