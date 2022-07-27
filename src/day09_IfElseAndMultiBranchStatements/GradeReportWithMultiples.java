package day09_IfElseAndMultiBranchStatements;

public class GradeReportWithMultiples {
    public static void main(String[] args) {

        int score = 75;
        String grade;

        if(score>=90 && score<= 90){
            grade = "Excellent";
        }
        else if(score>=80 && score<=89){
            grade = "Great";
        }
        else if(score>=70 && score<=79){
            grade = "Good";
        }
        else if(score>=60 && score<=69){
            grade = "Passed";
        }
        else{
            grade = "Failed";
        }
        System.out.println("grade = " + grade);
    }
}
