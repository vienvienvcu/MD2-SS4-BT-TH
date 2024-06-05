package BT;

import java.util.Scanner;

public class Student {
    private String name = "john";
    private String studentClass= "CO2";
    public Student(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentClass(String studentClass) {
       this.studentClass = studentClass;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("StudentClass: " + studentClass);
    }
}
