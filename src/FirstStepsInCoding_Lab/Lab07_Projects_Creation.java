package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class Lab07_Projects_Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int projects = Integer.parseInt(sc.nextLine());
        int result = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, result, projects);
    }
}
