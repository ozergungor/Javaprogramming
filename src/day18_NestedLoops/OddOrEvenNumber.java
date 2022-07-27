package day18_NestedLoops;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " is even number");
            } else {
                System.out.println(num + " is odd number");
            }
            System.out.println("Would you like to enter another number?");
            String answer = scan.next().toLowerCase();

            while (!(answer.equals("no") || answer.equals("yes"))){

                System.err.println("Invalid answer. Would you like to enter another number?");
                System.err.println("Please reply with yes or no");
                answer = scan.next().toLowerCase();

            }
            if(answer.equals("no")){
                break;
            }
        }
    }
}
