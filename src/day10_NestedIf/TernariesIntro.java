package day10_NestedIf;

public class TernariesIntro {
    public static void main(String[] args) {

        int n = 101;

        String result1 = (n%2 == 0)? "Even" : "Odd" ;

        System.out.println("result1 = " + result1);

        System.out.println("-----------------------");

        int age = 23;
        String result2 = (age>=21)? "eligible" : "not eligible";

        System.out.println("result2 = " + result2);

        System.out.println("----------------------");

        int number = -100;

        String result3 = (number> 0)? "positive" :(number < 0)? "negative" : "zero" ;
        System.out.println("result3 = " + result3);




    }
}
