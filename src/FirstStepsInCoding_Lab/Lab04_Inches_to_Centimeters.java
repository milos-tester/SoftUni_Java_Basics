package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab04_Inches_to_Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch = Double.parseDouble(sc.nextLine());
        double result = inch * 2.54;
        System.out.println(result);
    }
}