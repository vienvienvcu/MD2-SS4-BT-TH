package BT.BT8;

import java.util.Scanner;

public class Employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private boolean gender;
    private double salary;
    private double rate;
    public Employee(){

    }
    public Employee(String employeeId, String employeeName, int age, boolean gender, double salary, double rate) {

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public double calculateSalary(){
        return salary*rate;
    }

    public void inputData(Scanner scanner){
        System.out.println("Enter Employee ID: ");
        this.employeeId = scanner.next();
        System.out.println("Enter Employee Name: ");
        this.employeeName = scanner.next();
        System.out.println("Enter Employee Age: ");
        this.age = Integer.parseInt(scanner.next());
        System.out.println("Enter Employee Salary: ");
        this.salary = Double.parseDouble(scanner.next());
        System.out.println("enter Employee Rate: ");
        this.rate = Double.parseDouble(scanner.next());
        System.out.println("Enter Employee Gender: ");
        boolean isExit =true;
        do {
            System.out.println("Enter Employee Gender: ");
            System.out.println("1. male");
            System.out.println("2. female");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.next());
            switch (choice){
                case 1:
                    this.gender = true;
                    isExit = false;
                    break;
                case 2:
                    this.gender = false;
                    isExit = false;
                    break;
                default:
                    System.out.println("Invalid Choice,please try again");
            }
        }while (isExit);

    }

    public void displayData(){
        System.out.println("Employee ID: " + this.employeeId);
        System.out.println("Employee Name: " + this.employeeName);
        System.out.println("Employee Age: " + this.age);
        System.out.println("Employee Salary: " + this.salary);
        System.out.println("Employee Gender: " + (this.gender? "Male" : "Female"));
    }

    public void displaySalary(){
        System.out.println("Employee Salary: " + calculateSalary());
    }

}
