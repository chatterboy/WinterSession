package chap07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by AIServer on 2016-12-29.
 */

class Phone {
    String name;
    String addr;
    String phone;
    Phone() {}
    Phone(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
}

public class Open {
    static boolean isexist(String name, HashMap<String, Phone> hsh) {
        return hsh.keySet().contains(name);
    }
    static void input(HashMap<String, Phone> hsh, Scanner in) {
        System.out.print("이름>>");
        String name = in.next();
        System.out.print("주소>>");
        String addr = in.next();
        System.out.print("전화번호>>");
        String phone = in.next();
        if (!isexist(name, hsh)) {
            hsh.put(name, new Phone(name, addr, phone));
        }
    }
    static void search(HashMap<String, Phone> hsh, Scanner in) {
        System.out.print("이름>>");
        String key = in.next();
        Phone phone = hsh.get(key);
        System.out.println(phone.name + " " + phone.addr + " " + phone.phone);
    }
    static void list(HashMap<String, Phone> hsh) {
        Set<String> keys = hsh.keySet();
        for (String key : keys) {
            Phone phone = hsh.get(key);
            System.out.println(phone.name + " " + phone.addr + " " + phone.phone);
        }
    }
    static void erase(HashMap<String, Phone> hsh, Scanner in) {
        System.out.print("이름>>");
        String key = in.next();
        if (!hsh.containsKey(key)) {
            System.out.println(key + "은/는 등록되지 않은 사람입니다.");
        } else {
            hsh.remove(key);
            System.out.println(key + "은/는 삭제되었습니다.");
        }
    }
    public static void main(String [] args) {
        HashMap<String, Phone> hsh = new HashMap<String, Phone>();
        System.out.println("--------------------------------------------------------------");
        System.out.println("전화번호 관리 프로그램을 시작합니다. 파일로 저장하지 않습니다.");
        System.out.println("--------------------------------------------------------------");
        Scanner in = new Scanner(System.in);
        for (;;) {
            System.out.print("삽입:0, 삭제:1, 찾기:2, 전체보기:3, 종료4>>");
            int menu = in.nextInt();
            boolean exit = false;
            switch (menu) {
                case 0:
                    input(hsh, in);
                    break;
                case 1:
                    erase(hsh, in);
                    break;
                case 2:
                    search(hsh, in);
                    break;
                case 3:
                    list(hsh);
                    break;
                case 4:
                    exit = true;
                    break;
            }
            if (exit) break;
        }
        in.close();
        System.out.print("프로그램 종료");
    }
}
