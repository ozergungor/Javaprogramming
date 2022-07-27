package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Aaron";
        int age = 14;
        String citizen = "USA";
        boolean isEligible = age >= 18 && citizen == "USA" ;
        System.out.println(name + " is eligible to vote: " + isEligible);
        System.out.println("----------------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 23;
        int income = 4000;
        boolean isEligibletoGetLoan = creditScore >=700 && age2 >=21 && income >= 6000;
        System.out.println(name2 + " is eligible to get loan: " + isEligibletoGetLoan );
        System.out.println("---------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');
        System.out.println(name3 + " is eligible: " + isEligible3);
        System.out.println("--------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = true;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true ;
        System.out.println(name4 + " is US citizen: " + isEligible4);
        System.out.println("----------------------------");

        String name5 = "Mehmet";
        int age5 = 26;
        String citizen5 = "Turkish";
        char gender5 = 'M';
        boolean isEligible5 = age5 >= 18 && citizen5 == "Turkish" &&
                (gender5 =='M' || gender5 =='F');
        System.out.println(name5 + " can get Turkish driver license: " + isEligible5);
        System.out.println("-----------------------");

        String student = "Anna";
        double gpa = 3.4;
        int familyIncome = 65000;
        boolean isEligible6 = gpa >= 3.5 || familyIncome <= 60000 ;
        System.out.println(student + " is eligible for scholarship: " + isEligible6);
        System.out.println("-------------------------------");

        boolean result2 = true;
        boolean result3 = !result2;
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);







    }
}
