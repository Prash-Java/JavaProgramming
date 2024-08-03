package basic_problems;

import java.util.Scanner;

public class CountOfDigitInNumber {
    private static final Scanner sc = new Scanner(System.in);
    private static int count = 0;
    private static int givenNum;
    private static int digit;

    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            System.out.println("Enter the number: ");
            try {
                givenNum = sc.nextInt();
            } catch (Exception ex) {
                System.out.println("Not a valid number...");
                break;
            }
            if (givenNum == 'X' || givenNum == 'x') {
                System.out.println("Please enter the valid numerical value...");
                break;
            }
            int originalGivenNumVal = givenNum;
            System.out.printf("Enter the digit to count its occurrence in %d", givenNum);
            System.out.println();
            digit = sc.nextInt();
            System.out.println();
            while(givenNum > 0) {
                int tempDigit = givenNum % 10;
                if (tempDigit == digit) {
                    ++count;
                }
                givenNum = givenNum / 10;
            }
            System.out.printf("Total recurrence of digit %d in %d: %d", digit, originalGivenNumVal, count);
            System.out.println();
            count = 0;
        }
        sc.close();
    }
}
