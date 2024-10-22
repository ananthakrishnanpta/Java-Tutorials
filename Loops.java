public class Loops {
    public static void main(String[] args) {
        // 1. For Loop
        System.out.println("For Loop Examples:");

        // Example 1: Print numbers from 1 to 5 using a for loop
        System.out.println("Example 1: Print numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " "); // Output: 1 2 3 4 5
        }
        System.out.println(); // New line for better readability

        // Example 2: Print even numbers from 0 to 10
        System.out.println("Example 2: Print even numbers from 0 to 10");
        for (int i = 0; i <= 10; i += 2) {
            System.out.print(i + " "); // Output: 0 2 4 6 8 10
        }
        System.out.println(); // New line for better readability

        // 2. While Loop
        System.out.println("While Loop Examples:");

        // Example 1: Print numbers from 1 to 5 using a while loop
        System.out.println("Example 1: Print numbers from 1 to 5");
        int count1 = 1;
        while (count1 <= 5) {
            System.out.print(count1 + " "); // Output: 1 2 3 4 5
            count1++;
        }
        System.out.println(); // New line for better readability

        // Example 2: Print the first 5 numbers of the Fibonacci series using a while loop
        System.out.println("Example 2: Print the first 5 Fibonacci numbers");
        int n1 = 0, n2 = 1, n3, number = 5;
        int count2 = 0;
        System.out.print(n1 + " " + n2 + " "); // Print the first two Fibonacci numbers
        while (count2 < number - 2) { // Subtract 2 as we have already printed two numbers
            n3 = n1 + n2; // Next Fibonacci number
            System.out.print(n3 + " "); // Output: 0 1 1 2 3
            n1 = n2; // Update n1 to the last Fibonacci number
            n2 = n3; // Update n2 to the new Fibonacci number
            count2++;
        }
        System.out.println(); // New line for better readability

        // 3. Do-While Loop
        System.out.println("Do-While Loop Examples:");

        // Example 1: Print numbers from 1 to 5 using a do-while loop
        System.out.println("Example 1: Print numbers from 1 to 5");
        int count3 = 1;
        do {
            System.out.print(count3 + " "); // Output: 1 2 3 4 5
            count3++;
        } while (count3 <= 5);
        System.out.println(); // New line for better readability

        // Example 2: Print the first 5 multiples of 3 using a do-while loop
        System.out.println("Example 2: Print the first 5 multiples of 3");
        int multiple = 3, limit = 5, i = 1;
        do {
            System.out.print(multiple * i + " "); // Output: 3 6 9 12 15
            i++;
        } while (i <= limit);
        System.out.println(); // New line for better readability
    }
}
