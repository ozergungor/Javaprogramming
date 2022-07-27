package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scan.nextLine();

        System.out.println("Enter your programming name: ");

        String program = scan.nextLine();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your school name: ");
        String schoolName = scan.nextLine();

        System.out.println("name = " + name);
        System.out.println("program = " + program);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();



    }
}
