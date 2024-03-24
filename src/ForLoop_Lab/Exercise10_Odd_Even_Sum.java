package ForLoop_Lab;

import java.util.Scanner;

public class Exercise10_Odd_Even_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_inputs = Integer.parseInt(sc.nextLine());

        int sum_odd = 0;
        int sum_even = 0;

        for (int i = 0; i < number_inputs; i++) {
            int input = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) sum_even += input;
            else sum_odd += input;
        }

        if (sum_odd == sum_even) System.out.printf("Yes\nSum = %d", sum_even);
        else System.out.printf("No\nDiff = %d", Math.abs(sum_even-sum_odd));
    }
}