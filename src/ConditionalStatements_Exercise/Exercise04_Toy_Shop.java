package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise04_Toy_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double trip_price = Double.parseDouble(sc.nextLine());
        int puzzles = Integer.parseInt(sc.nextLine());
        int dolls = Integer.parseInt(sc.nextLine());
        int bears = Integer.parseInt(sc.nextLine());
        int minions = Integer.parseInt(sc.nextLine());
        int trucks = Integer.parseInt(sc.nextLine());
        int toy_number = puzzles + dolls + bears + minions + trucks;
        double result = puzzles * 2.60 + dolls * 3.00 + bears * 4.10 + minions * 8.20 + trucks * 2.00;
        if (toy_number >= 50) result *= 0.75;

        result = result * 0.90;
        double profit = result - trip_price;

        if (result >= trip_price) System.out.printf("Yes! %.2f USD left.", profit);
        else System.out.printf("Not enough money! %.2f USD needed.", Math.abs(profit));
    }
}