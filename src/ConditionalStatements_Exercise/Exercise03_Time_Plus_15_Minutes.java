package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise03_Time_Plus_15_Minutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        int minutes = Integer.parseInt(sc.nextLine());
        int total_time = hour * 60 + minutes + 15;
        int hour_result = total_time / 60;
        int minutes_result = total_time % 60;

        if (hour_result > 23) hour_result = 0;

        System.out.printf("%d:%02d", hour_result, minutes_result);
    }
}