package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class Lab10_Invalid_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if (number < 100 || number > 200){
            if (number != 0) System.out.println("invalid");
        }
    }
}