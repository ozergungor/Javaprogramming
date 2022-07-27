package day15_ForLoop;

import java.util.Scanner;

public class factorialNumber_Task4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        int result = 1;

        for(int i = (int)num;  i >= 1 ; i-- ){
            result *= i;
        }
        System.out.println("Factorial number of "+ num +" : " + result);
    }
}
/*
4. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
