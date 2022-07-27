package day17_While_DoWhile;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String marriageProposal = scan.nextLine().toLowerCase();

        while (!(marriageProposal.equals("yes") || marriageProposal.equals("no"))) {
            System.out.println("Invalid answer,please re-enter");
            marriageProposal = scan.next().toLowerCase();
        }
        if (marriageProposal.equals("yes")) {
            System.out.println("Congrats");
        } else {
            System.out.println("Goodbye");
        }
    }
}
/*
Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
 */
