package basic_problems;

import java.util.Scanner;

public class DetermineCharCase {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        char ch = sc.nextLine().trim().charAt(0);
        if(ch >= 'a' && ch <='z') {
            System.out.println("Given character is lowercase...");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Given character is uppercase...");
        } else {
            System.out.println("Case is not applicable...");
        }
        sc.close();
    }
}
