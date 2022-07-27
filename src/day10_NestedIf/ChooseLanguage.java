package day10_NestedIf;

public class ChooseLanguage {
    public static void main(String[] args) {

        int number = 1;

        String result = (number >=1 && number <=5)? (number==1)? "Hello" :(number==2)? "Hola"
                :(number==3)? "Merhaba" :(number==4)? "Privet" : "Merci" : "Invalid number";

        System.out.println(result);


    }
}
