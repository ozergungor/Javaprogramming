package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean result1 = 200 > 40 ;
        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150 ;
        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100 ;
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >= 500 ;
        System.out.println("result4 = " + result4);

        // creditScore 720

        int creditScore = 600 ;
        boolean isElligibleforLoan = creditScore >= 720 ;
        System.out.println("isElligibleforLoan = " + isElligibleforLoan);

        boolean result5 = 100 < 200 ;
        System.out.println("result5 = " + result5);

        int score = 75 ;
        boolean hasFailed = score <= 59 ;
        System.out.println("hasFailed = " + hasFailed);

        int x = 100;
        int y = 200 ;
        boolean equal = x==y ;
        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good guy";
        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a' ;
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java" ;
        System.out.println("result10 = " + result10);

        boolean result11 = 100 != 200 ;
        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break";
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300 ;
        System.out.println("result13 = " + result13);




    }
}
