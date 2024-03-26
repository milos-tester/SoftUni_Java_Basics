package ConditionalStatements_Lab;

import java.util.Scanner;

public class Lab02_Greater_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_one = Integer.parseInt(sc.nextLine());
        int number_two = Integer.parseInt(sc.nextLine());
        if (number_one > number_two) System.out.println(number_one);
        else System.out.println(number_two);
    }
}