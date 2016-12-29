package chap07;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by AIServer on 2016-12-29.
 */

public class Prob09 {
    static class Student {
        String name;
        String dept;
        String id;
        String grade;
        Student() {}
        Student(String name, String dept, String id, String grade) {
            this.name = name;
            this.dept = dept;
            this.id = id;
            this.grade = grade;
        }
        void print() {
            System.out.println("이름>>" + name);
            System.out.println("학과>>" + dept);
            System.out.println("학번>>" + id);
            System.out.println("평균 학점>>" + grade);
        }
    }
    public static void main(String [] args) {
        HashMap<String, Student> hsh = new HashMap<String, Student>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 2; ++i) {
            System.out.print("이름>>");
            String name = in.next();
            System.out.print("학과>>");
            in.skip("[\n\r]+");
            String dept = in.nextLine();
            System.out.print("학번>>");
            String id = in.next();
            System.out.print("평균 학점>>");
            String grade = in.next();
            hsh.put(id, new Student(name, dept, id, grade));
        }
        in.close();
        Set<String> keys = hsh.keySet();
        for (String key : keys) {
            hsh.get(key).print();
        }
    }
}
