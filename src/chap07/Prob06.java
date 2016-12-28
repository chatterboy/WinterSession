package chap07;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by AIServer on 2016-12-28.
 */

abstract class GraphicObject {
    int x;
    int y;
    int w;
    int h;
    GraphicObject(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public abstract void view();
}

class Rect extends GraphicObject {
    Rect(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    @Override
    public void view() {
        String res = new String();
        res += String.valueOf(x);
        res += ",";
        res += String.valueOf(y);
        res += " -> ";
        res += String.valueOf(w);
        res += ",";
        res += String.valueOf(h);
        res += "의 사각형";
        System.out.println(res);
    }
}

class Line extends GraphicObject {
    Line(int x, int y, int w, int h) {
        super(x, y, w, h);
    }
    @Override
    public void view() {
        String res = new String();
        res += String.valueOf(x);
        res += ",";
        res += String.valueOf(y);
        res += " -> ";
        res += String.valueOf(w);
        res += ",";
        res += String.valueOf(h);
        res += "의 선";
        System.out.println(res);
    }
}

class GraphicEditor {
    Vector<GraphicObject> v = new Vector<GraphicObject>();
    void add(GraphicObject ob) {
        v.add(ob);
    }
    void draw() {
        Iterator<GraphicObject> iterator = v.iterator();
        while (iterator.hasNext()) {
            iterator.next().view();
        }
    }
}

public class Prob06 {
    public static void main(String [] args) {
        GraphicEditor g = new GraphicEditor();
        g.add(new Rect(2, 2, 3, 4));
        g.add(new Line(3, 3, 8, 8));
        g.add(new Line(2, 5, 6, 6));
        g.draw();
    }
}
