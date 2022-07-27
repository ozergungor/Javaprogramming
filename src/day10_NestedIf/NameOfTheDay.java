package day10_NestedIf;

public class NameOfTheDay {
    public static void main(String[] args) {

        int number = -1;
        boolean daymustbe7days = number >= 1 && number <= 7;

        if (daymustbe7days) {

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        } else {
            System.out.println("You must designate a number between 1-7");
        }
    }
}

