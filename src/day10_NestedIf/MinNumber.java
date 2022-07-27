package day10_NestedIf;

public class MinNumber {
    public static void main(String[] args) {
        /*
Write 3 different number between 0-100 and find the min number among them
 */

        int a = 115;
        int b = 28;
        int c = 1;

        if (a >= 0 && a <= 100 && b >= 0 && b <= 100 && c >= 0 && c <= 100) {

            if (a < b && a < c) {
                System.out.println(a + " is min number");
            } else if (b < a && b < c) {
                System.out.println(b + " is min number");
            } else {
                System.out.println(c + " is min number");
            }
        } else {
            System.out.println("Invalid number");
        }
    }
}

