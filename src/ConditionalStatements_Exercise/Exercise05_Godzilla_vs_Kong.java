package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise05_Godzilla_vs_Kong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double movie_budget = Double.parseDouble(sc.nextLine());
        int clothes = Integer.parseInt(sc.nextLine());
        double clothes_price = Double.parseDouble(sc.nextLine());

        double decor = movie_budget * 0.10;
        double clothes_total = clothes_price * clothes;
        if (clothes > 150) clothes_total *= 0.90;
        double movie_sum = decor + clothes_total;

        if (movie_sum<=movie_budget) System.out.printf("Action!\nWingard starts filming with %.2f USD left.", movie_budget-movie_sum);
        else System.out.printf("Not enough money!\nWingard needs %.2f USD more.", movie_sum-movie_budget);
    }
}