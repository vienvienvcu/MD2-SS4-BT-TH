package BT;

import java.util.Scanner;

public class MyClassMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyClass myClass = new MyClass();
        System.out.println("input data");
        myClass.inputData(scanner);
        myClass.display();
    }
}
