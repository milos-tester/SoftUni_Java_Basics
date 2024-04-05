package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab12_Trade_Commissions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String city = sc.nextLine();
        double sales = Double.parseDouble(sc.nextLine());
        switch (city){
            case "London":
                if (sales >= 0 && sales <= 500) sales *= 0.05;
                else if (sales <= 1000) sales *= 0.07;
                else if (sales <= 10000) sales *= 0.08;
                else if (sales > 10000) sales *= 0.12;
                else {System.out.println("error");
                return;}
                System.out.printf("%.2f", sales);
                break;
            case "Paris":
                if (sales >= 0 && sales <= 500) sales *= 0.045;
                else if (sales <= 1000) sales *= 0.075;
                else if (sales <= 10000) sales *= 0.10;
                else if (sales > 10000) sales *= 0.13;
                else {System.out.println("error");
                return;}
                System.out.printf("%.2f", sales);
                break;
            case "Rome":
                if (sales >= 0 && sales <= 500) sales *= 0.055;
                else if (sales > 500 && sales <= 1000) sales *= 0.08;
                else if (sales > 1000 && sales <= 10000) sales *= 0.12;
                else if (sales > 10000) sales *= 0.145;
                else {System.out.println("error");
                return;}
                System.out.printf("%.2f", sales);
                break;
            default:
                System.out.println("error");
        }
    }
}