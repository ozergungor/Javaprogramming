package day23_CustomMethods_Void;

public class AgeOfThePerson {

    public static void main(String[] args) {

        ageOfThePerson(1972);
    }

    public static void ageOfThePerson(int birthYear){

        int age = 2022 - birthYear;

        System.out.println("Your age is " + age);
    }


}
