package day09_IfElseAndMultiBranchStatements;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        String name = "James";
        int age = 17;

        if (age >= 18) {
            System.out.println(name + " is eligible to buy alcohol");
        } else {

            System.out.println(name +" is NOT eligible to buy alcohol" );
        }
    }
}
