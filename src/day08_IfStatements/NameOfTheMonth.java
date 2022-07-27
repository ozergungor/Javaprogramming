package day08_IfStatements;

public class NameOfTheMonth {
    public static void main(String[] args) {

        int number = 12;
        boolean jan = number == 1;
        boolean feb = number == 2;
        boolean mar = number == 3;
        boolean apr = number == 4;
        boolean may = number == 5;
        boolean june = number == 6;
        boolean july = number == 7;
        boolean aug = number == 8;
        boolean sep = number == 9;
        boolean oct = number == 10;
        boolean nov = number == 11;
        boolean dec = number == 12;

        if(jan){
            System.out.println("January");
        }

        if(feb){
            System.out.println("February");
        }
        if(mar){
            System.out.println("March");
        }

        if(apr){
            System.out.println("April");
        }

        if(may){
            System.out.println("May");
        }

        if(june){
            System.out.println("June");
        }

        if(july) {
            System.out.println("July");
        }

        if(aug){
            System.out.println("August");
        }

        if(sep){
            System.out.println("September");
        }

        if(oct){
            System.out.println("October");
        }

        if (nov){
            System.out.println("November");
        }

        if(dec){
            System.out.println("December");
        }
    }
}
