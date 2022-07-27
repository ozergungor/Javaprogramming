package day09_IfElseAndMultiBranchStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Bahar";
        int age = 17;
        String citizen = "Turkey";

        if(age >= 18 && citizen == "USA"){
            System.out.println(name + " can vote");
        }else{
            System.out.println(name + " can NOT vote");
        }
    }
}
