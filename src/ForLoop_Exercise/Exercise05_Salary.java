package ForLoop_Exercise;

import java.util.Scanner;

public class Exercise05_Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabs = Integer.parseInt(sc.nextLine());
        int salary = Integer.parseInt(sc.nextLine());
        int fine = 0;

        for (int i = 0; i < tabs; i++) {
            String site = sc.nextLine();
            switch (site){
                case "Facebook":
                    fine += 150;
                    break;
                case "Instagram":
                    fine += 100;
                    break;
                case "Reddit":
                    fine += 50;
                    break;
            }
            if (fine>=salary){
                System.out.println("You have lost your salary.");
                break;
            }
        }
        if (salary > fine) System.out.printf("%d", salary-fine);
        }
    }