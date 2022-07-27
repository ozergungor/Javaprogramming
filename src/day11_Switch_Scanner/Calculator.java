package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {

        double n1 = 20.5,
                n2 = 10.3;

        char operator = '+';

        boolean isValid = operator == '+' || operator=='-' ||
                operator == '*' || operator =='/';

        if(isValid){
            switch(operator){

                case '+':
                    System.out.println(n1 + n2);
                    break;

                case '-':
                    System.out.println(n1 - n2);
                    break;

                case '*':
                    System.out.println(n1 * n2);
                    break;

                default:
                    System.out.println(n1 / n2);


            }


        }else{
            System.out.println("Invalid operator: " + operator);

        }
    }
}
