package day08_IfStatements;

public class Minnumber {
    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 1;

        if(n1 < n2) {
            System.out.println(n1 + " is the min. number" );
        }

        if(n1 > n2){
            System.out.println(n2 + " is the min. number");
        }

        if(n1 == n2){
            System.out.println(n1 + " and " + n2 + " are equal to each other");
        }
    }
}
