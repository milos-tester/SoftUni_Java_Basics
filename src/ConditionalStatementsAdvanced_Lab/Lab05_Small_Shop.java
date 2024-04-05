package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab05_Small_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double price = 0;
        switch (product){
            case "coffee":
                switch (city) {
                    case "London":
                        price = 0.50;
                        break;
                    case "Rome":
                        price = 0.40;
                        break;
                    case "Paris":
                        price = 0.45;
                        break;
                }
                break;
            case "water":
                switch (city) {
                    case "London":
                        price = 0.80;
                        break;
                    case "Rome":
                        price = 0.70;
                        break;
                    case "Paris":
                        price = 0.70;
                        break;
                }
                break;
            case "beer":
                switch (city) {
                    case "London":
                        price = 1.20;
                        break;
                    case "Rome":
                        price = 1.15;
                        break;
                    case "Paris":
                        price = 1.10;
                        break;
                }
                break;
            case "sweets":
                switch (city) {
                    case "London":
                        price = 1.45;
                        break;
                    case "Rome":
                        price = 1.30;
                        break;
                    case "Paris":
                        price = 1.35;
                        break;
                }
                break;
            case "peanuts":
                switch (city) {
                    case "London":
                        price = 1.60;
                        break;
                    case "Rome":
                        price = 1.50;
                        break;
                    case "Paris":
                        price = 1.55;
                        break;
                }
                break;
        }
        double result = price * quantity;
        System.out.println(result);
    }
}