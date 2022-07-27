package day11_Switch_Scanner;

public class Grades2 {
    public static void main(String[] args) {

        char grade = 'C';


        switch (grade){

            case 'A':
            case 'B':
            case 'C':
            case 'D':
                 System.out.println("Passed");
                 break;

            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");
                break;





        }
    }
}
