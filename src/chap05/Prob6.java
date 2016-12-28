package chap05;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */

class DObject {
    public DObject next;
    public DObject() {
        next = null;
    }
    public void draw() {
        System.out.println("DObjet draw");
    }
}

class Line extends DObject {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends DObject {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends DObject {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

public class Prob6 {
    static DObject head = null;
    interface Figure {
        public DObject get(int i);
    }
    static void add(DObject content) {
        if (head == null) {
            head = content;
        } else {
            DObject tmp = head;
            for (; tmp.next != null; tmp = tmp.next);
            tmp.next = content;
        }
    }
    static void print() {
        for (DObject tmp = head; tmp != null; tmp = tmp.next) {
            tmp.draw();
        }
    }
    static void erase(int pos) {
        int n = 0;
        for (DObject tmp = head; tmp != null; tmp = tmp.next, ++n);
        if (pos < 1 || pos > n) {
            System.out.println("올바른 위치를 입력하세요.");
        } else {
            int m = 1;
            DObject now = head;
            for (; m < pos; now = now.next, ++m);
            if (m == 1) {
                head = now == null ? null : now.next;
            } else {
                DObject prev = head;
                for (; prev.next != now; prev = prev.next);
                prev.next = now.next;
            }
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        Figure figure = (int i) -> {
            if (i == 1) return new Line();
            if (i == 2) return new Rect();
            return new Circle();
        };
        for (;;) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int menu = in.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
                    int type = in.nextInt();
                    add(figure.get(type));
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    int pos = in.nextInt();
                    erase(pos);
                    break;
                case 3:
                    print();
                    break;
                case 4:
                    exit = true;
                    break;
            }
            if (exit) break;
        }
        in.close();
    }
}
