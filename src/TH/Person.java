package TH;

import java.util.Scanner;

public class Person {
    private String FirstName;
    private String lastName;
    private int age;
    private boolean gender;
    public Person(){

    }
    public Person(String firstName, String lastName, int age, boolean gender) {
        this.FirstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
//    structor


    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
    public void inputData(Scanner scanner){
        System.out.println("Enter First Name:");
        this.FirstName = scanner.nextLine();
        System.out.println("Enter Last Name:");
        this.lastName = scanner.nextLine();
        System.out.println("Enter Age:");
        this.age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Gender:");
        boolean isExit = true;
        do {
            System.out.println("your choice: ");
            System.out.println("1. male ");
            System.out.println("2. female ");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.gender = true;
                    isExit = false;
                    break;
                case 2:
                    this.gender = false;
                    isExit = false;
                    break;
                default:
                    System.out.println("Invalid Choice, try again");
            }
        }while (isExit);

    }
    public void displayData(){
        System.out.printf("firstName: %s\nlastName: %s\nage: %s\ngender: %s\n", this.FirstName, this.lastName, this.age, this.gender?"male":"female");
    }
}
