public class Strings {
    public static void main(String[] args) {
        String text = "  Hello, World!  ";

        // 1. length()
        System.out.println("Length: " + text.length()); // Length: 15

        // 2. charAt()
        System.out.println("Character at index 7: " + text.charAt(7)); // Character at index 7: W

        // 3. substring()
        System.out.println("Substring from index 2 to 5: " + text.substring(2, 5)); // Substring from index 2 to 5: Hel

        // 4. indexOf()
        System.out.println("Index of 'o': " + text.indexOf('o')); // Index of 'o': 4

        // 5. lastIndexOf()
        System.out.println("Last index of 'o': " + text.lastIndexOf('o')); // Last index of 'o': 8

        // 6. toUpperCase()
        System.out.println("Uppercase: " + text.toUpperCase()); // Uppercase:   HELLO, WORLD!  

        // 7. toLowerCase()
        System.out.println("Lowercase: " + text.toLowerCase()); // Lowercase:   hello, world!  

        // 8. trim()
        System.out.println("Trimmed: '" + text.trim() + "'"); // Trimmed: 'Hello, World!'

        // 9. replace()
        System.out.println("Replace 'o' with '0': " + text.replace('o', '0')); // Replace 'o' with '0':  H0ll0, W0rld!

        // 10. split()
        String[] words = text.trim().split(", ");
        System.out.println("Split by ', ': ");
        for (String word : words) {
            System.out.println(word); // Hello, World!
        }

        // 11. contains()
        System.out.println("Contains 'World': " + text.contains("World")); // Contains 'World': true

        // 12. startsWith()
        System.out.println("Starts with '  He': " + text.startsWith("  He")); // Starts with '  He': true

        // 13. endsWith()
        System.out.println("Ends with 'ld!  ': " + text.endsWith("ld!  ")); // Ends with 'ld!  ': true

        // 14. equals()
        String anotherString = "Hello, World!";
        System.out.println("Equals 'Hello, World!': " + text.trim().equals(anotherString)); // Equals 'Hello, World!': true

        // 15. equalsIgnoreCase()
        System.out.println("Equals Ignore Case 'HELLO, WORLD!': " + text.trim().equalsIgnoreCase("HELLO, WORLD!")); // Equals Ignore Case 'HELLO, WORLD!': true

        // 16. valueOf()
        int number = 123;
        System.out.println("String value of 123: " + String.valueOf(number)); // String value of 123: 123

        // 17. concat()
        System.out.println("Concatenation: " + text.trim().concat(" How are you?")); // Concatenation: Hello, World! How are you?

        // 18. isEmpty()
        System.out.println("Is empty: " + text.trim().isEmpty()); // Is empty: false

        // 19. compareTo()
        System.out.println("Compare to 'Hello': " + text.trim().compareTo("Hello")); // Compare to 'Hello': 7 (Positive means this string is greater)

        // 20. format()
        String formatted = String.format("Formatted string: %s %d", "Hello", 10);
        System.out.println(formatted); // Formatted string: Hello 10
    }
}
