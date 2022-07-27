package day17_While_DoWhile;

import java.util.Scanner;

public class WillYouMarryMe {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String marriageProposal = scan.nextLine().toLowerCase();

        while (!(marriageProposal.equals("yes") || marriageProposal.equals("no"))) {
            System.out.println("Invalid answer,please re-enter");
            marriageProposal = scan.nextLine().toLowerCase();

        }if(marriageProposal.equals("yes") ){
            System.out.println("Congrats!");

        }else{
            System.out.println("Good bye");
        }
    }
}
