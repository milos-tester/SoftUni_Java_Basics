package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab08_Pet_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dog_packages = Integer.parseInt(sc.nextLine());
        int cat_packages = Integer.parseInt(sc.nextLine());
        double cat_price = cat_packages * 4.00;
        double dog_price = dog_packages * 2.50;
        double result = cat_price + dog_price;
        System.out.println(result + " USD.");
    }
}