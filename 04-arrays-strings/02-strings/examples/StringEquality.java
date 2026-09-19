public class StringEquality {
    public static void main(String[] args) {
        String first = new String("Java");
        String second = new String("Java");

        System.out.println(first == second);         // false: different objects
        System.out.println(first.equals(second));    // true: same text
    }
}
