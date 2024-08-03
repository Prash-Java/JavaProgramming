package basic_problems;

import java.util.Scanner;

public class BasicCalculator {
    private static final Scanner sc = new Scanner(System.in);
    private static int a;
    private static int b;

    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter first number: ");
            try {
                a = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Not a valid number, terminating calculator...");
                break;
            }
            System.out.println("Enter second number: ");
            b = sc.nextInt();
            System.out.println("Enter any one operation among +,-,*,/,%");
            char ch = sc.next().trim().charAt(0);
            if (ch == '+') {
                System.out.println("Sum of given numbers: " + (a+b));
            } else if (ch == '-') {
                System.out.println("Difference of given numbers: " + (a-b));
            } else if (ch == '*') {
                System.out.println("Multiplication of given numbers: " + (a*b));
            } else if (ch == '/') {
                if(b == 0) {
                    System.out.println("Enter second number greater than 0:");
                    b = sc.nextInt();
                }
                System.out.println("Division of given numbers: " + (a/b));
            } else if (ch == '%') {
                if(b == 0) {
                    System.out.println("Enter second number greater than 0:");
                    b = sc.nextInt();
                }
                System.out.println("Modulo of given numbers: " + (a%b));
            }
        }
        sc.close();
    }
}
