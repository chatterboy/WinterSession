package chap04;

import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-26.
 */
public class Prob6 {
    static class Concert {
        String [] sclass = new String[10];
        String [] aclass = new String[10];
        String [] bclass = new String[10];
        Concert() {
            for (int i = 0; i < sclass.length; ++i)
                sclass[i] = "----";
            for (int i = 0; i < aclass.length; ++i)
                aclass[i] = "----";
            for (int i = 0; i < bclass.length; ++i)
                bclass[i] = "----";
        }
        void reserve(String name, int pos, String [] xclass) {
            --pos;
            xclass[pos] = name;
        }
        void print(String cname, String [] xclass) {
            System.out.print(cname + ">>");
            for (String seat : xclass)
                System.out.print(" " + seat);
            System.out.println();
        }
        void search() {
            print("S", sclass);
            print("A", aclass);
            print("B", bclass);
        }
        void cancel(String name, String [] xclass) {
            for (int i = 0; i < xclass.length; ++i) {
                if (xclass[i].equals(name)) {
                    xclass[i] = "----";
                }
            }
        }
    }
    interface Func {
        public String [] get(int i);
    }
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        Concert concert = new Concert();
        for (;;) {
            System.out.print("예약<1>, 조회<2>, 취소<3>, 끝내기<4>>>");
            int menu = in.nextInt();
            int menuRev;
            String name;
            boolean exit = false;
            Func getclass = (int i) -> {
                if (i == 1) return concert.sclass;
                if (i == 2) return concert.aclass;
                return concert.bclass;
            };
            switch (menu) {
                case 1:
                    System.out.print("좌석구분 S<1>, A<2>, B<3>>>");
                    menuRev = in.nextInt();
                    concert.print("SAB".substring(menuRev-1, menuRev-1), getclass.get(menuRev));
                    System.out.print("이름>>");
                    name = in.next();
                    System.out.print("번호>>");
                    int pos = in.nextInt();
                    concert.reserve(name, pos, getclass.get(menuRev));
                    break;
                case 2:
                    concert.search();
                    break;
                case 3:
                    System.out.print("좌석구분 S<1>, A<2>, B<3>>>");
                    menuRev = in.nextInt();
                    concert.print("SAB".substring(menuRev-1, menuRev-1), getclass.get(menuRev));
                    System.out.print("이름>>");
                    name = in.next();
                    concert.cancel(name, getclass.get(menuRev));
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("잘못된 번호입니다. 다시 입력하세요.");
                    break;
            }
            if (exit) break;
        }
        in.close();
    }
}
