package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch = '6';

        String result = (ch >= '0' && ch <= '9')? "Digit" :( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') )? "Alphabetic"
                : "Special character";

        System.out.println("result = " + result);

        }
    }

