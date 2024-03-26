package ConditionalStatements_Lab;

import java.util.Scanner;

public class Lab04_Password_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String password_input = sc.nextLine();

        if (password_input.equals(password)) System.out.println("Welcome");
        else System.out.println("Wrong password!");
    }
}