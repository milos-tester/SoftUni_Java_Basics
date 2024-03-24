package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab09_Yard_Greening {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double nr_sq_meters=Double.parseDouble(scanner.nextLine());
        double price_wo_discount=nr_sq_meters*7.61;
        double discount=price_wo_discount/100*18;
        double total_price=price_wo_discount-discount;
        System.out.printf("The final price is: %.2f USD.\n",total_price);
        System.out.printf("The discount is: %.2f USD.", discount);
    }
}