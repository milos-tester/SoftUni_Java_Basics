package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise04_Vacation_Books_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_pages = Integer.parseInt(sc.nextLine());
        int pages = Integer.parseInt(sc.nextLine());
        int number_of_days = Integer.parseInt(sc.nextLine());
        int reading_time = number_of_pages / pages;
        int result = reading_time / number_of_days;
        System.out.println(result);
    }
}
