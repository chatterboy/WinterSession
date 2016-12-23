package chap04;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-23.
 */
public class Prob5 {
    static class Add {
        int a;
        int b;
        void setValue(int a, int b) {
            this.a = a;
            this.b = b;
        }
        int calculate() {
            return a + b;
        }
    }
    static class Sub {
        int a;
        int b;
        void setValue(int a, int b) {
            this.a = a;
            this.b = b;
        }
        int calculate() {
            return a - b;
        }
    }
    static class Mul {
        int a;
        int b;
        void setValue(int a, int b) {
            this.a = a;
            this.b = b;
        }
        int calculate() {
            return a * b;
        }
    }
    static class Div {
        int a;
        int b;
        void setValue(int a, int b) {
            this.a = a;
            this.b = b;
        }
        double calculate() {
            return 1. * a / b;
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in).useDelimiter("\\s");
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = in.nextInt();
        int b = in.nextInt();
        char op = in.next().charAt(0);
        System.out.println(String.valueOf(a) + " " + String.valueOf(b) + " " + op);
        int isol;
        double dsol;
        switch (op) {
            case '+':
                Add add = new Add();
                add.setValue(a, b);
                isol = add.calculate();
                System.out.print(isol);
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a, b);
                isol = sub.calculate();
                System.out.print(isol);
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a, b);
                isol = mul.calculate();
                System.out.print(isol);
                break;
            case '/':
                Div div = new Div();
                div.setValue(a, b);
                dsol = div.calculate();
                System.out.print(dsol);
                break;
        }
    }
}
