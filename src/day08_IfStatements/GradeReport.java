package day08_IfStatements;

public class GradeReport {
    public static void main(String[] args) {

        String name = "Mary";
        int score = 30;

        boolean excellent = score >= 90 && score <= 100;
        boolean great = score >= 80 && score <= 89;
        boolean good = score >= 70 && score >=79;
        boolean passed = score >= 60 && score <= 69;
        boolean failed = score >= 0 && score <= 59;

        if(excellent) {
            System.out.println(name + "'s grade report is Excellent: A");
        }

        if(great) {
            System.out.println(name + "'s grade report is Great: B" );
        }

        if(good) {
            System.out.println(name + "'s grade report is Good: C");
        }

        if(passed) {
            System.out.println(name + "'s grade report is Passed: D");
        }

        if(failed) {
            System.out.println(name + "'s grade report is Failed: F");
        }
    }
}
