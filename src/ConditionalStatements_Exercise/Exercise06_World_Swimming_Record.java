package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise06_World_Swimming_Record {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double record = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double time_for_one_meter = Double.parseDouble(sc.nextLine());

        double total_time = distance * time_for_one_meter;
        double added_time = Math.floor(distance / 15) * 12.5;
        double result_time = total_time + added_time;
        if (result_time<record) System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", result_time);
        else System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record-result_time));
    }
}
