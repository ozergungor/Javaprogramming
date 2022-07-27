package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {
        evenOrOddNumber(10);

    }

    public static void evenOrOddNumber(int number){



        if(number %2 ==0){

            System.out.println(number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }


    }
}
