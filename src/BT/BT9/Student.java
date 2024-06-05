package BT.BT9;

import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private String address;
    private String phone;
    public Student() {
    }
    public Student (String studentId,String studentName,int age,boolean sex, String address, String phone){
            this.studentId = studentId;
            this.studentName = studentName;
            this.age = age;
            this.sex =sex;
            this.address = address;
            this.phone = phone;

    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId1) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(Scanner scanner){
        System.out.println("Enter Student ID: ");
        this.studentId = scanner.next();
        System.out.println("Enter Student Name: ");
        this.studentName = scanner.next();
        System.out.println("Enter Student Age: ");
        this.age = Integer.parseInt(scanner.next());
        System.out.println("Enter student address");
        this.address = scanner.next();
        System.out.println("Enter student phone");
        this.phone = scanner.next();
        System.out.println("enter your  sex choice");
        boolean isExit = true;
        do {
              System.out.println("1. Male");
              System.out.println("2. Female");
              System.out.println("Enter your choice: ");
              int choice = scanner.nextInt();
              switch (choice) {
                  case 1:
                      this.sex = true;
                      isExit = false;
                      break;
                  case 2:
                      this.sex = false;
                      isExit = false;
                      break;
                  default:
                      System.out.println("pleas your choice");
              }
        }while(isExit);
    }
    public void displayData(){
        System.out.println("Student id is : " + this.studentId);
        System.out.println("Student name is :" +  this.studentName);
        System.out.println("Student age is :" + this.age);
        System.out.println("Student address is: " + this.address);
        System.out.println("Student phone is " + this.phone);
        System.out.println("Student sex is: " + (this.sex ? "male": "female"));
    }
}
