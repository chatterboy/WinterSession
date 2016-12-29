package chap04;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-26.
 */
public class Open {
    static class Player {
        String name;
        String word;
        Player() {
            this.name = "";
            this.word = "";
        }
        Player(String name) {
            this.name = name;
            this.word = "";
        }
        void set(String name) {
            this.name = name;
        }
        void sayWord(Scanner in) {
            word = in.next();
        }
        String getword() {
            return word;
        }
        String getname() {
            return name;
        }
        boolean succeed(String last) {
            return last.charAt(last.length() - 1) == word.charAt(0);
        }
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int n = in.nextInt();
        Player [] players = new Player[n];
        for (int i = 0; i < players.length; ++i) {
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = in.next();
            players[i] = new Player(name);
        }
        String last = "아버지";
        System.out.println("시작하는 단어는 " + last + "입니다.");
        for (int i = 0;; ++i, i %= players.length) {
            System.out.print(players[i % n].getname() + ">>");
            players[i].sayWord(in);
            if (!players[i].succeed(last)) {
                System.out.println(players[i].getname() + "이 졌습니다.");
                break;
            }
            last = players[i].getword();
        }
        in.close();
    }
}
