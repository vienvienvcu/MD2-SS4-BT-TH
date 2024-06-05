package BT;

import java.util.Scanner;

public class FansMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fans fans = new Fans();
        System.out.println("input data");
        fans.inputData(scanner);
        System.out.println("output data");
        fans.displayData();
    }
}
