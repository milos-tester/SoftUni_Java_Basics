package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise02_Radians_to_Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radians = Double.parseDouble(sc.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(degrees);
    }
}