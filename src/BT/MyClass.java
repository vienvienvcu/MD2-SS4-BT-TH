package BT;

import java.util.Scanner;

public class MyClass {
    private String myString;
    public MyClass(){

    }
    public MyClass(String myString){
        this.myString = myString;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }
    public void inputData(Scanner scanner){
        System.out.print("Enter String: ");
        this.myString = scanner.nextLine();
    }
    public void display(){
        System.out.println("myString : " + myString);
    }
}

