package day07_Operators;

import javax.lang.model.SourceVersion;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int num1 = 9;
        int num2 = 3;
        int num3 = num1 / num2 ;
        int remainder = num1 % num2;

        System.out.println("num3 = " + num3);
        System.out.println("remainder = " + remainder);

        System.out.println(num1 + " divided by " + num2 +
                " is equal to " + num3 +
                " with a remainder of " + remainder);
    }
}
