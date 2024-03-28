package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise01_Sum_Seconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_time = Integer.parseInt(sc.nextLine());
        int second_time = Integer.parseInt(sc.nextLine());
        int third_time = Integer.parseInt(sc.nextLine());
        int sum = first_time + second_time + third_time;
        int minutes = sum / 60;
        int seconds = sum % 60;
        System.out.printf("%d:%02d", minutes, seconds);
    }
}