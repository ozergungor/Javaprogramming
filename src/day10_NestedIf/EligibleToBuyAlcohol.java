package day10_NestedIf;

public class EligibleToBuyAlcohol {
    public static void main(String[] args) {

        int age = 25;
        boolean hasId = false;

        if (hasId) {

            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
            System.out.println("You must have an ID to buy alcohol");
        }
    }
}
