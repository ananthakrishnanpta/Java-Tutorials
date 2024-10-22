public class ForLoops {
    public static void main(String[] args) {
        // 1. Traditional For Loop
        System.out.println("Traditional For Loop Examples:");

        // Example 1: Print numbers from 1 to 5
        System.out.println("Example 1: Print numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " "); // Output: 1 2 3 4 5
        }
        System.out.println(); // New line for better readability

        // Example 2: Print squares of numbers from 1 to 5
        System.out.println("Example 2: Print squares of numbers from 1 to 5");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i * i + " "); // Output: 1 4 9 16 25
        }
        System.out.println(); // New line for better readability

        // 2. Enhanced For Loop (For-Each Loop)
        System.out.println("Enhanced For Loop (For-Each Loop) Examples:");

        // Example 1: Print elements of an array
        System.out.println("Example 1: Print elements of an array");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int number : numbers) {
            System.out.print(number + " "); // Output: 10 20 30 40 50
        }
        System.out.println(); // New line for better readability

        // Example 2: Print characters of a string
        System.out.println("Example 2: Print characters of a string");
        String text = "Hello";
        for (char character : text.toCharArray()) {
            System.out.print(character + " "); // Output: H e l l o
        }
        System.out.println(); // New line for better readability

        // 3. Nested For Loop
        System.out.println("Nested For Loop Examples:");

        // Example 1: Multiplication table for 1 to 5
        System.out.println("Example 1: Multiplication table for 1 to 5");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + "\t"); // Output: Multiplication table
            }
            System.out.println(); // New line after each row
        }

        // Example 2: Pattern printing (right-angle triangle)
        System.out.println("Example 2: Pattern printing (right-angle triangle)");
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Output: right-angle triangle pattern
            }
            System.out.println(); // New line after each row
        }
    }
}
