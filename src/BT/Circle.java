package BT;

import java.util.Scanner;

public class Circle {
    private double r;
    private String color;
    public Circle(){

    }
    public Circle(double r, String color) {
        this.r = r;
        this.color = color;
    }
//    CONSTRUCTOR

    public double getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double perimeter(){
        return (2* Math.PI * r);
    }
    public Double acreage(){
        return (Math.PI * Math.pow((r/2),2));
    }
    public void  inputData(Scanner scanner){
        System.out.println("enter the r of circle");
        this.r = Double.parseDouble(scanner.nextLine());
        System.out.println("enter the color of circle");
        this.color = scanner.nextLine();
    }
    public void outputData(){
        System.out.println("r: " + r);
        System.out.println("color: " + color);
    }
     public void outputPerimeter(){
        System.out.println("perimeter: " + perimeter());
     }
     public void outputAcreage(){
        System.out.println("acreage: " + acreage());
     }
}
