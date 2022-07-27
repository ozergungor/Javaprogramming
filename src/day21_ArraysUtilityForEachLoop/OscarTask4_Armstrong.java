package day21_ArraysUtilityForEachLoop;

import java.util.Scanner;

public class OscarTask4_Armstrong {
    public static void main(String[] args) {

        int originalNum, digit, cubeSum = 0, num;

        System.out.println("Enter the number:");
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        originalNum = num;

        while (num > 0) {
            digit = num % 10;
            cubeSum += digit * digit * digit;
            num /= 10;
        }

        if (cubeSum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else{
            System.out.println(originalNum + " is not an Armstrong number");
    }
    }
}
