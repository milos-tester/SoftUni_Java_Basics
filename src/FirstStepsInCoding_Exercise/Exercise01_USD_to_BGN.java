package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise01_USD_to_BGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        double bgn = usd * 1.79549;
        System.out.println(bgn);
    }
}