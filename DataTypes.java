public class DataTypes {
    public static void main(String[] args) {
        // 1. Primitive Data Types

        // 1.1. byte
        byte byteValue = 100; // 8-bit signed integer
        System.out.println("Byte value: " + byteValue);

        // 1.2. short
        short shortValue = 10000; // 16-bit signed integer
        System.out.println("Short value: " + shortValue);

        // 1.3. int
        int intValue = 100000; // 32-bit signed integer
        System.out.println("Int value: " + intValue);

        // 1.4. long
        long longValue = 100000L; // 64-bit signed integer
        System.out.println("Long value: " + longValue);

        // 1.5. float
        float floatValue = 10.5f; // 32-bit floating point
        System.out.println("Float value: " + floatValue);

        // 1.6. double
        double doubleValue = 20.99; // 64-bit floating point
        System.out.println("Double value: " + doubleValue);

        // 1.7. char
        char charValue = 'A'; // 16-bit Unicode character
        System.out.println("Char value: " + charValue);

        // 1.8. boolean
        boolean booleanValue = true; // true or false
        System.out.println("Boolean value: " + booleanValue);

        // 2. Reference Data Types

        // 2.1. String
        String stringValue = "Hello, Java!"; // String is a reference type
        System.out.println("String value: " + stringValue);

        // 2.2. Array
        int[] intArray = {1, 2, 3, 4, 5}; // Array of integers
        System.out.print("Array values: ");
        for (int value : intArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 2.3. Object
        Object objectValue = new Object(); // Base class for all objects
        System.out.println("Object value: " + objectValue.toString());

        // 2.4. Custom Class
        Person person = new Person("Alice", 30); // Instance of a custom class
        System.out.println("Person: " + person);
    }
}

// Custom class for demonstration
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
