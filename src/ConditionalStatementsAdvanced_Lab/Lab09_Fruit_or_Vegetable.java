package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab09_Fruit_or_Vegetable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_data = sc.nextLine();

        switch (input_data){
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
                System.out.println("fruit");
                break;
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
        }
    }
}