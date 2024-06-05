package TH;

import java.util.Scanner;

public class Student {
    String studentId;
    String studentName;
    String sex;
    char className;
    int age;
    String address;

    public Student() {
    }

    public Student(String studentId, String studentName, String sex, char className, String address, int age) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex =sex;
        this.className = className;
        this.address = address;
        this.age = age;
    }

    public  String display(){
        return "student{" + studentId+ "," + studentName +", "+ sex + "," + className +"," + age +"," + address +"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input number id student: ");
        String studentId = scanner.nextLine();
        System.out.println("input name student: ");
        String studentName = scanner.nextLine();
        System.out.println("input age student: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("input address sex: ");
        String sex = scanner.nextLine();
        System.out.println("input class name: ");
        char className = scanner.nextLine().charAt(0);
        System.out.println("input student address: ");
        String address = scanner.nextLine();
        Student student = new Student(studentId,studentName,sex,className,address,age);
        System.out.println("student: " + student.display());
    }
}
