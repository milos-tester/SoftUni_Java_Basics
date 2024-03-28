package ConditionalStatements_Exercise;

import java.util.Scanner;

public class Exercise07_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int vga = Integer.parseInt(sc.nextLine());
        int cpu = Integer.parseInt(sc.nextLine());
        int ram = Integer.parseInt(sc.nextLine());
        double vga_price = vga * 250.00;
        double cpu_price = cpu *vga_price * 0.35;
        double ram_price = ram * vga_price * 0.10;
        double total_price = vga_price + cpu_price + ram_price;
        if (vga>cpu) total_price *= 0.85;

        if (budget>=total_price) System.out.printf("You have %.2f USD left!", budget-total_price);
        else System.out.printf("Not enough money! You need %.2f USD more!", total_price-budget);
    }
}
