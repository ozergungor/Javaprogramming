package day09_IfElseAndMultiBranchStatements;

public class PosNegZero {
    public static void main(String[] args) {

        int num = 53;

        if (num > 0){
            System.out.println(num + " is positive number");
           } else if (num < 0){
            System.out.println(num + " is negative number");
        } else {
            System.out.println(num + " is zero");
        }
    }
}
