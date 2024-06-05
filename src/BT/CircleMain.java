package BT;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();
        do {
            System.out.println("enter your choice");
            System.out.println("*****MENU**********:");
            System.out.println("1. Input Circle");
            System.out.println("2. Display Circle");
            System.out.println("3. perimeter in : ");
            System.out.println("4. acreage");
            System.out.println("5. EXIT");
            System.out.println("Enter your choice 1-5");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("input circle r");
                    circle.inputData(scanner);
                    break;
                case 2:
                    System.out.println("display circle");
                    circle.outputData();
                    break;
                case 3:
                    System.out.println("perimeter is : ");
                    circle.perimeter();
                    circle.outputPerimeter();
                    break;
                case 4:
                    System.out.println("acreage is : ");
                    circle.acreage();
                    circle.outputAcreage();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }


        }while (true);
    }
}
