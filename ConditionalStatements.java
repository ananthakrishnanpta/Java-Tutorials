import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conditional Statements (if-else)
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Using if-else to determine if the person is an adult or minor
        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Using nested if-else
        if (age < 0) {
            System.out.println("Invalid age.");
        } else if (age < 18) {
            System.out.println("You are a minor.");
        } else if (age < 65) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior citizen.");
        }

        // Switch Statement
        System.out.print("Enter a day number (1-7): ");
        int day = scanner.nextInt();

        // Using switch to determine the day of the week
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number";
                break;
        }

        System.out.println("The day is: " + dayName);

        // Closing the scanner
        scanner.close();
    }
}
