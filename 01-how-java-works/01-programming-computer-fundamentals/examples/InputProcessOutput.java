import java.util.Scanner;

public class InputProcessOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.printf("%.1f°C is %.1f°F%n", celsius, fahrenheit);
    }
}
