package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab07_Working_Hours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();

        if (hour >= 10 && hour <= 18){
            switch (day){
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                    System.out.println("open");
                    break;
                default:
                    System.out.println("closed");
            }
        }
        else System.out.println("closed");
    }
}