package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        int number = 100;
        System.out.println("number = " + number);
        number = 200;
        System.out.println("number = " + number);

        String word = "Java programming";
        System.out.println("word = " + word);
        word = "Wooden spoon";
        System.out.println("word = " + word);
        word = "Cydeo";
        System.out.println("word = " + word);

        int x = 100;
        x = x + 200;
        System.out.println("x = " + x);

        int y = 10;
        y += 40;
        System.out.println("y = " + y);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        availableBalance += 300 ;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance -= 500 ;
        System.out.println("availableBalance = " + availableBalance);
        availableBalance -= 200 ;
        availableBalance += 400 ;
        System.out.println("availableBalance = " + availableBalance);

        double salary = 50000.50 ;
        salary *= 2;
        System.out.println("salary = " + salary);

        double num2 = 25000 ;
        num2 /= 2 ;
        System.out.println("num2 = " + num2);

        double num3 = 100 ;
        num3 %= 3;
        System.out.println("num3 = " + num3);

        int amount = 127 ;
        int quarters = amount / 25 ;
        int cents = amount % 25 ;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int cents2 = 127 ;
        cents2 %= 25 ;
        System.out.println("cents2 = " + cents2);

        int num7 = 300;
        num7 %= 16 ;
        System.out.println("num7 = " + num7);

        int balance = 3500 ;
        balance %= 153 ;
        System.out.println("balance = " + balance);






    }
}
