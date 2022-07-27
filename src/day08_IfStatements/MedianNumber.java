package day08_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 3;
        int b = 105;
        int c = 1;

        boolean IsaMedian = (a > b && a < c) || (a < b && a > c);
        boolean IsbMedian = (b > a && b < c) || (b < a && b > c);
        boolean IscMedian = (c > a && c < b) || (c < a && c > b);

        if (IsaMedian) {
            System.out.println(a + " is median number");
        }

        if (IsbMedian) {
            System.out.println(b + " is median number");
        }

        if(IscMedian) {
            System.out.println(c + " is median number");

        }


    }
}
