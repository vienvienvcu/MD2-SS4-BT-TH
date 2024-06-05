package TH;

import java.util.Scanner;

public class Rectangle {
    double width, height;
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.width+this.height)*2;
    }
    public String display(){
        return "Retangular{"+ "width="+ width +",height="+height +"}";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter width");
        double width = scanner.nextDouble();
        System.out.println("enter height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("your rectangle  is: "+ rectangle.display());
        System.out.println("your area is "+rectangle.getArea());
        System.out.println("your perimeter is "+rectangle.getPerimeter());
    }
}
