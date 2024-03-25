package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise06_Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int detergent = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double materials = (nylon + 2) * 1.50 + (paint * 1.10) * 14.50 + detergent * 5.00 + 0.40;
        double workers = materials * 0.30 * hours;
        double result = workers + materials;
        System.out.println(result);
    }
}