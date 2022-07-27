package day24_CustomMethods_ReturnMethod;

public class InıtialsOfThePerson {

    public static void main(String[] args) {

        initials("güngör", "özer");



    }
    public static void initials(String firstName, String lastName){

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }
}
