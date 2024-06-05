package BT;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circles circles = new Circles();
        circles.display();
        circles.getRadius();
        circles.getColor();
    }
}
