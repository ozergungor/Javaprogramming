package day17_While_DoWhile;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if( num < 0){
                break;
            }
            sum += num;
        }

        System.out.println(sum);

        scan.close();
    }
}
/*
Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
 */
