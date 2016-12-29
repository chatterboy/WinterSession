package chap07;

import java.util.LinkedList;

/**
 * Created by AIServer on 2016-12-29.
 */

interface Stack<T> {
    public T pop();
    public boolean push(T ob);
}

class MyStack<T> implements Stack<T> {
    LinkedList<T> lst = null;
    MyStack() {
        lst = new LinkedList<T>();
    }
    @Override
    public T pop() {
        return lst.pop();
    }
    @Override
    public boolean push(T ob) {
        lst.addFirst(ob);
        return true;
    }
    public int size() {
        return lst.size();
    }
}

public class Prob11 {
    public static void main(String [] args) {
        MyStack<Integer> st = new MyStack<Integer>();
        for (int i = 0; i < 5; ++i) {
            st.push(i);
        }
        for (; st.size() > 0;) {
            Integer ix = st.pop();
            System.out.println(ix);
        }
    }
}
