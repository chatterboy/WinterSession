package chap04;

/**
 * Created by AIServer on 2016-12-23.
 */
public class Prob2 {
    static class Rectangle {
        int x1, y1;
        int x2, y2;
        Rectangle() {}
        Rectangle(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        private void set(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
        private int square() {
            return (x2 - x1) * (y2 - y1);
        }
        private void show() {
            String out = new String();
            out = "(" + String.valueOf(x1) + "," + String.valueOf(y1) + "), " +
                    "(" + String.valueOf(x2) + "," + String.valueOf(y2) + "), " +
                    String.valueOf(square());
            System.out.println(out);
        }
        private boolean equals(Rectangle s) {
            return x1 == s.x1 && y1 == s.y1 && x2 == s.x2 && y2 == s.y2;
        }
    }
    public static void main(String [] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);
        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if (r.equals(s)) {
            System.out.print("두 사각형은 같습니다.");
        }
    }
}
