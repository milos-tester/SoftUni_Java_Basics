package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab03_Rectangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        int result = a * b;
        System.out.println(result);
    }
}