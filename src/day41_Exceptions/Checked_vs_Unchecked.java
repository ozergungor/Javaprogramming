package day41_Exceptions;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        // System.out.println(a/b);
        // System.out.println("Wooden spoon");

        // char[] characters = {'A', 'B', 'C'};
        // System.out.println(characters[99]);

        System.out.println("Hello");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Cydeo");

        try {
            FileInputStream file = new FileInputStream("path of the file");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
