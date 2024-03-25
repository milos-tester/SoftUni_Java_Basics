package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise07_Food_Delivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chicken = Integer.parseInt(sc.nextLine());
        int fish = Integer.parseInt(sc.nextLine());
        int vegetarian = Integer.parseInt(sc.nextLine());
        double menu_price = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double desert = menu_price * 0.20;
        double result = menu_price + desert + 2.50;
        System.out.println(result);
    }
}