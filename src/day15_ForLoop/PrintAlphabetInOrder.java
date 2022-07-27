package day15_ForLoop;

public class PrintAlphabetInOrder {
    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {

            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print((char) i + " ");

        }
        System.out.println();
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print((char) i + " ");
        }
    }
}
/*
Print the followings:
    A --> Z
    a --> z
    Z --> A
    z --> a
 */
