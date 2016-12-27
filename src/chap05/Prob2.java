package chap05;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-27.
 */

class Calc {
    int a;
    int b;
    void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    int calculate() {
        return 0;
    }
}

class Add extends Calc {
    @Override
    void setValue(int a, int b) {
        super.setValue(a, b);
    }
    @Override
    int calculate() {
        return a + b;
    }
}

class Sub extends Calc {
    @Override
    void setValue(int a, int b) {
        super.setValue(a, b);
    }

    @Override
    int calculate() {
        return a - b;
    }
}

class Mul extends Calc {
    @Override
    void setValue(int a, int b) {
        super.setValue(a, b);
    }

    @Override
    int calculate() {
        return a * b;
    }
}

class Div extends Calc {
    @Override
    void setValue(int a, int b) {
        super.setValue(a, b);
    }

    @Override
    int calculate() {
        return a / b;
    }
}

public class Prob2 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = in.nextInt();
        int b = in.nextInt();
        String op = in.next();
        switch (op) {
            case "+":
                Add add = new Add();
                add.setValue(a, b);
                System.out.print(add.calculate());
                break;
            case "-":
                Sub sub = new Sub();
                sub.setValue(a, b);
                System.out.print(sub.calculate());
                break;
            case "*":
                Mul mul = new Mul();
                mul.setValue(a, b);
                System.out.print(mul.calculate());
                break;
            case "/":
                Div div = new Div();
                div.setValue(a, b);
                System.out.print(div.calculate());
                break;
        }
        in.close();
    }
}
