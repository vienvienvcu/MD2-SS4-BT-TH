package BT;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        student.display();
        student.setName("vien");
        student.setStudentClass("C03");
        student.display();

    }
}
