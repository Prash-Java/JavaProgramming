package switchcases;

import java.util.Scanner;

public class TraditionalSwitchCases {
    private static final Scanner sc = new Scanner(System.in);
    private static int day;
    public static void main(String[] args) {
        System.out.println("Enter the numeric day: ");
        day = sc.nextInt();
//        Traditional Switch Case
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a correct numeric value...");
        }

//        Enhanced Switch Case
        switch (day) {
            case 1 -> System.out.println("First Day Of Week, Monday");
            case 2 -> System.out.println("Second Day Of Week,Tuesday");
            case 3 -> System.out.println("Third Day Of Week,Wednesday");
            case 4 -> System.out.println("Fourth Day Of Week,Thursday");
            case 5 -> System.out.println("Fifth Day Of Week,Friday");
            case 6 -> System.out.println("Sixth Day Of Week,Saturday");
            case 7 -> System.out.println("Seventh Day Of Week,Sunday");
            default -> System.out.println("Not a correct numeric day...");
        }

        switch (day) {
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekends");
            default -> System.out.println("Does not qualify...");
        }
    }
}
