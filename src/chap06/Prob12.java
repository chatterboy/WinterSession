package chap06;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */

class Person {
    String name;
    int [] nums;
    Person(String name) {
        this.name = name;
        this.nums = new int[3];
    }
    public void generate() {
        for (int i = 0; i < 3; ++i) {
            nums[i] = (int)(Math.random() * 4);
        }
    }
    public boolean issame() {
        boolean ret = true;
        for (int i = 1; i < nums.length; ++i) {
            ret &= nums[i] == nums[0];
        }
        return ret;
    }
}

public class Prob12 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("플레이어 1의 이름을 입력하세요>>");
        String name1 = in.next();
        System.out.print("플레이어 2의 이름을 입력하세요>>");
        String name2 = in.next();
        in.close();
        Person player1 = new Person(name1);
        Person player2 = new Person(name2);
        do {
            player1.generate();
            player2.generate();
        } while (player1.issame() || player2.issame());
        if (player1.issame() && player2.issame()) {
            System.out.print("tie");
        } else {
            if (player1.issame()) {
                System.out.print("player 1 win");
            } else {
                System.out.print("player 2 win");
            }
        }
    }
}
