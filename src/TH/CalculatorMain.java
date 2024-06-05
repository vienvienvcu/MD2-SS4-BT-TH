package TH;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        do {
            System.out.println("***********MENU***************:");
            System.out.println("1. input data");
            System.out.println("2. show data ");
            System.out.println("3. sum");
            System.out.println("4. Subtraction");
            System.out.println("5. calculus ");
            System.out.println("6. division");
            System.out.println("7. exit");
            System.out.println("Enter your choice 1-7: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("input data: ");
                    calculator.inputData(scanner);
                    break;
                case 2:
                    System.out.println("show data: ");
                    calculator.displayResult();
                    break;
                case 3:
                    System.out.println("sum: ");
                    calculator.sum();
                    calculator.displaySum();
                    break;
                case 4:
                    System.out.println("subtraction: ");
                    calculator.Subtraction();
                    calculator.displaySubtraction();
                    break;
                case 5:
                    System.out.println("calculus : ");
                    calculator.calculus();
                    calculator.displayCalculus();
                    break;
                case 6:
                    System.out.println("division");
                    calculator.division();
                    calculator.displayDivision();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("vui long lua chon 1-2");
            }
        }while (true);
    }
}
