public class Maths {
    public static void main(String[] args) {
        double num1 = -5.5;
        double num2 = 3.5;
        double base = 2;
        double exponent = 3;
        double angleInDegrees = 45;
        double angleInRadians = Math.toRadians(angleInDegrees); // Convert degrees to radians
        
        // 1. abs()
        System.out.println("Absolute value of " + num1 + ": " + Math.abs(num1)); // Absolute value of -5.5: 5.5

        // 2. sqrt()
        System.out.println("Square root of 16: " + Math.sqrt(16)); // Square root of 16: 4.0

        // 3. pow()
        System.out.println("2 raised to the power of 3: " + Math.pow(base, exponent)); // 2 raised to the power of 3: 8.0

        // 4. max()
        System.out.println("Maximum of " + num1 + " and " + num2 + ": " + Math.max(num1, num2)); // Maximum of -5.5 and 3.5: 3.5

        // 5. min()
        System.out.println("Minimum of " + num1 + " and " + num2 + ": " + Math.min(num1, num2)); // Minimum of -5.5 and 3.5: -5.5

        // 6. round()
        System.out.println("Round " + num1 + ": " + Math.round(num1)); // Round -5.5: -5

        // 7. ceil()
        System.out.println("Ceiling of " + num1 + ": " + Math.ceil(num1)); // Ceiling of -5.5: -5.0

        // 8. floor()
        System.out.println("Floor of " + num1 + ": " + Math.floor(num1)); // Floor of -5.5: -6.0

        // 9. random()
        System.out.println("Random number between 0.0 and 1.0: " + Math.random()); // Random number between 0.0 and 1.0: (e.g., 0.123456)

        // 10. sin()
        System.out.println("Sine of 45 degrees: " + Math.sin(angleInRadians)); // Sine of 45 degrees: 0.7071067811865475

        // 11. cos()
        System.out.println("Cosine of 45 degrees: " + Math.cos(angleInRadians)); // Cosine of 45 degrees: 0.7071067811865476

        // 12. tan()
        System.out.println("Tangent of 45 degrees: " + Math.tan(angleInRadians)); // Tangent of 45 degrees: 1.0

        // 13. toDegrees()
        System.out.println("Convert radians to degrees (π): " + Math.toDegrees(Math.PI)); // Convert radians to degrees (π): 180.0

        // 14. toRadians()
        System.out.println("Convert degrees to radians (180): " + Math.toRadians(180)); // Convert degrees to radians (180): 3.141592653589793

        // 15. exp()
        System.out.println("Exponential of 1: " + Math.exp(1)); // Exponential of 1: 2.718281828459045

        // 16. log()
        System.out.println("Natural logarithm of e: " + Math.log(Math.E)); // Natural logarithm of e: 1.0

        // 17. log10()
        System.out.println("Base 10 logarithm of 100: " + Math.log10(100)); // Base 10 logarithm of 100: 2.0

        // 18. hypot()
        System.out.println("Hypotenuse of 3 and 4: " + Math.hypot(3, 4)); // Hypotenuse of 3 and 4: 5.0

        // 19. cbrt()
        System.out.println("Cube root of 27: " + Math.cbrt(27)); // Cube root of 27: 3.0

        // 20. IEEEremainder()
        System.out.println("IEEE remainder of 10 and 3: " + Math.IEEEremainder(10, 3)); // IEEE remainder of 10 and 3: 1.0
    }
}
