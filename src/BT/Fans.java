package BT;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Fans {
    private int speed;
    private boolean status;
    private double radius;
    private String color;
    public Fans(){

    }
    public Fans(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void inputData(Scanner scanner){
        System.out.print("Speed: ");
        this.speed = Integer.parseInt(scanner.nextLine());
        System.out.println("radius: ");
        this.radius = Double.parseDouble(scanner.nextLine());
        System.out.println("color: ");
        this.color = scanner.nextLine();
        System.out.print("status: ");
        boolean isExit = true;
        do {
            System.out.println("1.fan is on");
            System.out.println("2.fan is off");
            System.out.println("your choice");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    this.status = true;
                    isExit = false;
                    break;
                case 2:
                    this.status = false;
                     isExit = false;
                     break;
                default:
                    System.err.println("Invalid choice, please try again");
            }
        }while (isExit);

    }
    public void displayData(){
        System.out.println("speed: " + speed);
        System.out.println("radius: " + radius);
        System.out.println("color: " + color);
        System.out.println("status: " + (status ? "on" : "off"));
    }

}
