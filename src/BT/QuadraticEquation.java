package BT;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a, double b, double c) {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscriminant(){
         return (b*b-4*a*c);

    }
    public double getRoot1(){
        return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double getRoot2(){
       return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }
    public void inputData(Scanner scanner){
        System.out.println("Enter the a: ");
        this.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the b: ");
        this.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the c: ");
        this.c = Double.parseDouble(scanner.nextLine());
    }
    public void displayData(){
        System.out.println("a is :" + a);
        System.out.println("b is :" + b);
        System.out.println("c is :" + c);
    }
    public void displayEquation(){
        System.out.println("The equation is :"+ getDiscriminant());
    }
    public void displayRoot1(){
        System.out.println("Root 1 is :" + getRoot1());
    }
    public void displayRoot2(){
        System.out.println("Root 2 is :" + getRoot2());
    }
}
