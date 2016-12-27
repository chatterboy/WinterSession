package chap05;

import java.util.Objects;

/**
 * Created by AIServer on 2016-12-27.
 */

interface Stack {
    public int length();
    public Object pop();
    public boolean push(Object ob);
}

class StringStack implements Stack {
    int top;
    String [] st;
    StringStack() {
        top = -1;
        st = new String[5];
    }
    @Override
    public int length() {
        return 1 + top;
    }
    @Override
    public Object pop() {
        return st[top--];
    }
    @Override
    public boolean push(Object ob) {
        if (length() >= st.length) return false;
        st[++top] = Objects.toString(ob);
        return true;
    }
}

public class Prob3 {
    public static void main(String [] args) {
        StringStack ss = new StringStack();
        String [] ins = { "ab", "bc", "cd", "de", "ef", "fg" };
        for (int i = 0; i < ins.length; ++i) {
            System.out.println("Before pusing the stack's size: " + String.valueOf(ss.length()));
            ss.push(ins[i]);
            System.out.println("After pusing the stack's size: " + String.valueOf(ss.length()));
        }
        while (ss.length() > 0) {
            Object ob = ss.pop();
            String res = Objects.toString(ob);
            System.out.println(res);
        }
    }
}
