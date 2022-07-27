package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {

        int score = 155;

        String result = (score >= 0 && score <= 100) ? (score >= 90 && score <= 100) ? "Excellent"
                : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed" : "Invalid number";

        System.out.println("result = " + result);
    }
}
