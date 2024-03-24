package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Exercise04_FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int members = Integer.parseInt(sc.nextLine());
        double result = 0;

        switch (season){
            case "Spring":
                result = 3000;
                if (members <= 6) result *=0.9;
                else if (members > 6 && members <= 11) result *= 0.85;
                else if (members > 11) result *= 0.75;
                break;
            case "Summer":
            case "Autumn":
                result = 4200;
                if (members <= 6) result *=0.9;
                else if (members > 6 && members <= 11) result *= 0.85;
                else if (members > 11) result *= 0.75;
                break;
            case "Winter":
                result = 2600;
                if (members <= 6) result *=0.9;
                else if (members > 6 && members <= 11) result *= 0.85;
                else if (members > 11) result *= 0.75;
                break;
        }
        if (members % 2 == 0 && !season.equals("Autumn")) result *= 0.95;

        double money = Math.abs(result-budget);
        if (result > budget) System.out.printf("Not enough money! You need %.2f USD.",money);
        else System.out.printf("Yes! You have %.2f USD left.", money);
    }
}