package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise05_Supplies_for_School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens_input = Integer.parseInt(sc.nextLine());
        int markers_input = Integer.parseInt(sc.nextLine());
        int detergent_input = Integer.parseInt(sc.nextLine());
        int percentage_input = Integer.parseInt(sc.nextLine());

        double result = pens_input * 5.80 + markers_input * 7.20 + detergent_input * 1.20;
        double total = result - (result * percentage_input / 100);
        System.out.println(total);
    }
}