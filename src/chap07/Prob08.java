package chap07;

/**
 * Created by AIServer on 2016-12-29.
 */

class MyClass<E> {
    private E e;
    MyClass(E e) {
        this.e = e;
    }
    void set(E e) {
        this.e = e;
    }
    E get() {
        return e;
    }
}

public class Prob08 {
    public static void main(String [] args) {
        MyClass<String> myClass = new MyClass<String>("hi");
        System.out.println(myClass.get());
        myClass.set("hello");
        System.out.println(myClass.get());
    }
}
