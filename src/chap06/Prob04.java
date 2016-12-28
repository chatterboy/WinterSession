package chap06;

/**
 * Created by AIServer on 2016-12-28.
 */

class Circle {
    int x;
    int y;
    int r;
    Circle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    @Override
    public boolean equals(Object obj) {
        Circle c = (Circle)obj;
        return r == c.r;
    }
}

public class Prob04 {
    static void check(Circle a, Circle b) {
        if (a.r == b.r) {
            System.out.println("They are same circles");
        } else {
            System.out.println("They aren't same circles");
        }
    }
    public static void main(String [] args) {
        Circle c1 = new Circle(2, 8, 2);
        Circle c2 = new Circle(10, 4, 2);
        check(c1, c2);
        Circle c3 = new Circle(2, 8, 2);
        Circle c4 = new Circle(10, 4, 3);
        check(c3, c4);
    }
}
