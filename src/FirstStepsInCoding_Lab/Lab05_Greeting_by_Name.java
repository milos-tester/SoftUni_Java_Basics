package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab05_Greeting_by_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}