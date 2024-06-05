package TH;

import java.util.Scanner;

public class Calculator {
    double number1, number2;
    public Calculator() {

    }
    public Calculator(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
//    constructor

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    public double sum(){
        return (number1 + number2);

    }

    public double Subtraction(){
        return (number1 - number2);
    }
    public double calculus(){
        return (number1 * number2);
    }
    public double division(){
        return (number1 / number2);
    }

    public void inputData(Scanner scanner){
        System.out.println("Enter number1: ");
        this.number1 = scanner.nextDouble();
        System.out.println("Enter number2: ");
        this.number2 = scanner.nextDouble();
    }
    public void displayResult(){
        System.out.println("number1 is: " + this.number1);
        System.out.println("number2 is: " + this.number2);



    }
    public void displaySum(){
        System.out.println("sum is: " + this.sum());
    }
    public void displaySubtraction(){
        System.out.println("Subtraction is: " + this.Subtraction());
    }
    public void displayDivision(){
        System.out.println("Division is: " + this.division());
    }
    public void displayCalculus(){
        System.out.println("Calculus is: " + this.calculus());
    }
}
