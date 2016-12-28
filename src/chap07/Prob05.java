package chap07;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by AIServer on 2016-12-28.
 */

class Student {
    String name;
    String dept;
    String id;
    String grade;
    Student(String name, String dept, String id, String grade) {
        this.name = name;
        this.dept = dept;
        this.id = id;
        this.grade = grade;
    }
}

public class Prob05 {
    public static void main(String [] args) {
        int n = 2;
        ArrayList<Student> students = new ArrayList<Student>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < n; ++i) {
            System.out.print("이름을 입력하세요>>");
            String name = in.next();
            System.out.print("학과를 입력하세요>>");
            in.skip("[\n\r]+");
            String dept = in.nextLine();
            System.out.print("학번을 입력하세요>>");
            String id = in.next();
            System.out.print("평균 학점을 입력하세요>>");
            String grade = in.next();
            Student student = new Student(name, dept, id, grade);
            students.add(student);
        }
        in.close();
        for (Student student : students) {
            System.out.println(student.name);
            System.out.println(student.dept);
            System.out.println(student.id);
            System.out.println(student.grade);
            System.out.println();
        }
    }
}
