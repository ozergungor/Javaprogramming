package day09_IfElseAndMultiBranchStatements;

public class PosNegZeroWithBoolean {
    public static void main(String[] args) {

        int n = 0;

        boolean IsnPositive = n > 0 ;
        boolean IsnNegative = n < 0;

        if(IsnPositive){
            System.out.println("Positive");
        }
        else if(IsnNegative){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
