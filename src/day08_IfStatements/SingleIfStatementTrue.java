package day08_IfStatements;

public class SingleIfStatementTrue {
    public static void main(String[] args) {

        int number = 101;
        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber ;
        if (evenNumber) {
            System.out.println(number + " is even number");
        }

        if(oddNumber) {
            System.out.println(number + " is odd number");
        }

        System.out.println("------------------");

        int n = -200;
        boolean positiveNumber = n > 0;
        boolean negativeNumber = n < 0;
        boolean zeroNumber =  n==0;

        if(positiveNumber) {

            System.out.println(n + " is positive number");
        }

        if(negativeNumber) {
            System.out.println(n + " is negative number");

        }

        if(zeroNumber) {
            System.out.println(n + " is zero");
        }



    }
}
