package day08_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {

        String name = "Josh";
        int age = 18;
        String citizen = "UK";

        boolean isEligible = age >= 18 && citizen == "USA";

        if (isEligible) {
            System.out.println(name + " is eligible to vote");
        }

        if (! isEligible) {
            System.out.println(name + " is NOT eligible to vote");
        }
    }
}
