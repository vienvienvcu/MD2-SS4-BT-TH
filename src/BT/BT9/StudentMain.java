package BT.BT9;

import java.util.Scanner;

public class StudentMain {
    static Student [] arrStudents = new Student[1000];
    static int index = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        do {
            System.out.println("**********MENU***************:");
            System.out.println("1. Input student information");
            System.out.println("2. Display student information");
            System.out.println("3. Add student information");
            System.out.println("4. update student information");
            System.out.println("5. Delete student information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: \n");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    StudentMain.inputStudent(scanner);
                    break;
                case 2:
                   StudentMain.displayStudent();
                    break;
                case 3:
                   StudentMain.inputStudent(scanner);
                   StudentMain.displayStudent();
                    break;
                case 4:
                    StudentMain.updateStudent(scanner);
                    break;
                case 5:
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice,please try again");


            }


        }while (true);
    }
    public static void inputStudent(Scanner scanner) {
        System.out.print("input so luong student information: " );
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
//            khoi tao cac phan tu cua mang la doi tuong student
            System.out.println("enter student information: "+ (i+1));
            arrStudents[index] = new Student();
            arrStudents[index].inputData(scanner);
            index++;
        }

    }
    public static void displayStudent() {
         for (int i = 0; i < index; i++) {
             arrStudents[i].displayData();
         }


    }
}
