package result;

public class Result {

    public static void showResult(int score, int total) {

        System.out.println("\n=========== RESULT ===========");

        double percentage = ((double) score / total) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Obtained Marks: " + score);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80) {
            System.out.println("Grade: A");
        } else if (percentage >= 70) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else if (percentage >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}