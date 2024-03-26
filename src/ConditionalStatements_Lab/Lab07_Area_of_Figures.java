package ConditionalStatements_Lab;

import java.util.Scanner;

public class Lab07_Area_of_Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String figure_type = sc.nextLine();
        double side_a = Double.parseDouble(sc.nextLine());

        double result = 0;

        if (figure_type.equals("square")){
            result = side_a * side_a;
        }
        else if (figure_type.equals("rectangle")){
            double side_b = Double.parseDouble(sc.nextLine());
            result = side_a * side_b;
        }
        else if (figure_type.equals("circle")){
            result = Math.pow(side_a, 2) * Math.PI;
        }
        else if (figure_type.equals("triangle")){
            double side_b = Double.parseDouble(sc.nextLine());
            result = (side_a * side_b) / 2;
        }

        System.out.printf("%.3f", result);
    }
}