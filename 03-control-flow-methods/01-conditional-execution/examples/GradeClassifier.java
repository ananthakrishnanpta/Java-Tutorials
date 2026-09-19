public class GradeClassifier {
    public static void main(String[] args) {
        int score = 84;
        String grade = score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : "Needs work";
        System.out.println("Grade: " + grade);
    }
}
