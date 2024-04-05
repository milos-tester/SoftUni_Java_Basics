package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab08_Cinema_Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.println("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.println("14");
                break;
            default:
                System.out.println("16");
        }
    }
}