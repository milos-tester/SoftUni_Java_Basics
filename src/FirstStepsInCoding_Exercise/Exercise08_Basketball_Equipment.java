package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise08_Basketball_Equipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int annual_fee = Integer.parseInt(sc.nextLine());
        double sneakers = annual_fee * 0.60;
        double outfit = sneakers * 0.80;
        double ball = outfit * 0.25;
        double accessories = ball * 0.20;
        double result = annual_fee + sneakers + outfit + ball + accessories;
        System.out.println(result);
    }
}