package BT;

import java.util.Scanner;

public class QuadraticEquationMain {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("********MENU************");
            System.out.println("1. Input Data");
            System.out.println("2. Show data");
            System.out.println("3. show Discriminant");
            System.out.println("4. show root1");
            System.out.println("5. show root2");
            System.out.println("6. Exit");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("input data ");
                    quadraticEquation.inputData(scanner);
                    break;
                case 2:
                    System.out.println("show data");
                    quadraticEquation.displayData();
                    break;
                case 3:
                    System.out.println("show discriminant");
                    quadraticEquation.getDiscriminant();
                    quadraticEquation.displayEquation();

                    break;
                case 4:
                    System.out.println("show root1");
                    quadraticEquation.getRoot1();
                    quadraticEquation.displayRoot1();
                    break;
                case 5:
                    System.out.println("show root2");
                    quadraticEquation.getRoot2();
                    quadraticEquation.displayRoot2();
                    break;

                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, please try again");
            }
        }while (true);
    }
}
