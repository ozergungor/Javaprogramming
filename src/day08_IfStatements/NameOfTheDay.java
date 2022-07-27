package day08_IfStatements;

public class NameOfTheDay {
    public static void main(String[] args) {

        int number = 4;

        boolean monday = number == 1;
        boolean tues = number == 2;
        boolean wed = number == 3;
        boolean thurs = number == 4;
        boolean fri = number == 5;
        boolean sat = number == 6;
        boolean sun = number == 7;

        if(monday) {
            System.out.println("Monday");
        }

        if(tues){
            System.out.println("Tuesday");
        }

        if(wed){
            System.out.println("Wednesday");
        }

        if(thurs){
            System.out.println("Thursday");
        }

        if(fri){
            System.out.println("Friday");
        }

        if(sat) {
            System.out.println("Saturday");
        }

        if(sun){
            System.out.println("Sunday");
        }

    }
}
