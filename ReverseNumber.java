package basic_problems;

import java.util.Scanner;

public class ReverseNumber {
    private static final Scanner sc = new Scanner(System.in);
    private static int reverseNum = 0;


    public static void main(String[] args) {
        System.out.println("Enter the given number: ");
        int givenNum = sc.nextInt();
        System.out.print("The reverse of given number is: ");
        while(givenNum > 0) {
            int rem = givenNum % 10;
            givenNum = givenNum/10;
            reverseNum = (reverseNum * 10) + rem;
        }
        System.out.println(reverseNum);
        sc.close();
    }
}
