package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Exercise03_Deposit_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desposit_amount = Double.parseDouble(sc.nextLine());
        int term_deposit = Integer.parseInt(sc.nextLine());
        double annual_rate = Double.parseDouble(sc.nextLine());
        double result = desposit_amount + term_deposit * ((desposit_amount*annual_rate/100) / 12);
        System.out.println(result);
    }
}