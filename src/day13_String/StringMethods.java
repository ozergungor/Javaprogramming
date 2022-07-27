package day13_String;

public class StringMethods {

    public static void main(String[] args) {


        String word = "Cydeo";

        char thirdCharacter = word.charAt(3);

        System.out.println("thirdCharacter = " + thirdCharacter);

        System.out.println("-----------------");

        String s1 = "Batch 25 is the best batch";
        int totalNumOfCharacters = s1.length();

        System.out.println("totalNumOfCharacters = " + totalNumOfCharacters);

        char lastCharacter = s1.charAt(totalNumOfCharacters -1);
        System.out.println("lastCharacter = " + lastCharacter);

        System.out.println("----------------");

        String str = "wooden spoon";
        str = str.toUpperCase();
        System.out.println("str = " + str);

        String s = "JAVA";
        s = s.toLowerCase();
        System.out.println("s = " + s);

        String sentence = "Today is a great day to learn Java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println("sentence = " + sentence);

        String browsers = "Chrome";
        browsers = browsers.replace("Chrome", "Firefox");


    }
}
