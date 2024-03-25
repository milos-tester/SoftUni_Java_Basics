package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise09_Fish_Tank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = Integer.parseInt(sc.nextLine());
        int width = Integer.parseInt(sc.nextLine());
        int height = Integer.parseInt(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());
        double volume = length * width * height;
        double liters = volume / 1000;
        double result = liters * (1 - percentage / 100);
        System.out.println(result);
    }
}