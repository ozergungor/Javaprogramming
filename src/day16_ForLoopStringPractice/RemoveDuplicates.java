package day16_ForLoopStringPractice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "aabbccaa";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            String ch = "" + str.charAt(i);

            if (!result.contains(ch)) {
                result += ch;
            }
        }System.out.println("result = " + result);
    }
}
/*
Write a program that can remove the duplicated characters from a String
             Ex:
                 input : aabbccaa
                 output: abc
 */
