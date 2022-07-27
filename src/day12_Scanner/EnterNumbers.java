package day12_Scanner;

import java.util.Scanner;

public class EnterNumbers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 3 numbers");

        System.out.println("Enter num1:");
        int num1 = scan.nextInt();

        System.out.println("Enter num2:");
        int num2 = scan.nextInt();

        System.out.println("Enter num3:");
        int num3 = scan.nextInt();
        
        int sum = num1 + num2 + num3;

        System.out.println("sum = " + sum);
        
        
        
        
    }
}
