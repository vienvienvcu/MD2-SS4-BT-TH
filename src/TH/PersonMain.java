package TH;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        System.out.println("input data person");
        person.inputData(scanner);
        System.out.println("show data person");
        person.displayData();
    }
}
