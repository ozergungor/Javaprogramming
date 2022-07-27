package day09_IfElseAndMultiBranchStatements;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;
        boolean LeapYear = year % 4 == 0;

        if (LeapYear) {
            System.out.println("Year " + year + " is leap year");

        } else {
            System.out.println(year + " is NOT leap year");
        }
    }
}
