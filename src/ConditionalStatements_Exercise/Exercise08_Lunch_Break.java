package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise08_Lunch_Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String series = sc.nextLine();
        int episode_duration = Integer.parseInt(sc.nextLine());
        int break_duration = Integer.parseInt(sc.nextLine());
        double lunch_time = (double) break_duration / 8;
        double break_time = (double) break_duration / 4;
        double remaining_time = break_duration - lunch_time - break_time;
        int remaining = (int) Math.ceil(remaining_time-episode_duration);
        int needed = (int) Math.ceil(episode_duration-remaining_time);

        if (remaining_time>=episode_duration) System.out.printf("You have enough time to watch %s and left with %d minutes free time.", series, remaining);
        else System.out.printf("You don't have enough time to watch %s, you need %d more minutes.", series, needed);
    }
}