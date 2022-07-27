package day17_While_DoWhile;

import java.util.Scanner;

public class day17_Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers :");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int result=0;

        if(n1<0 || n2<0){
            System.out.println("Invalid number");
        }else{
            while (n1>= n2) {
                n1-=n2;
                result++;
            }System.out.println(result+" by remaining with "+n1);
        }
        scan.close();
    }
}
/*
Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
 */
