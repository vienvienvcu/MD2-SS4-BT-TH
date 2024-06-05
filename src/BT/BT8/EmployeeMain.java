package BT.BT8;

import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        Employee employee = new Employee();
        do {
            System.out.println("************MENU****************:");
            System.out.println("1. Input information of employee");
            System.out.println("2. Display employee information");
            System.out.println("3. Display employee salary details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: \n");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    employee.inputData(scanner);
                    break;
                case 2:
                    employee.displayData();
                    break;
                case 3:
                    employee.calculateSalary();
                    employee.displaySalary();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("please enter your choice 1-4");
            }
        }while (true);
    }
}
