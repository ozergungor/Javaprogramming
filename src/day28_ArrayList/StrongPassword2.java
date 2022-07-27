package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "Cydeo1990@";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChars = 0;

        for (int i = 0; i < password.length() ; i++) {

            char each = password.charAt(i);
            if(Character.isUpperCase(each)){
                countUpperCase++;
            } else if (Character.isLowerCase(each)) {
                countLowerCase++;                
            } else if (Character.isDigit(each)) {
                countDigits++;
                
            }else{
                countSpecialChars++;
            }

        }
        System.out.println("countUpperCase = " + countUpperCase);
        System.out.println("countLowerCase = " + countLowerCase);
        System.out.println("countDigits = " + countDigits);
        System.out.println("countSpecialChars = " + countSpecialChars);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase > 0;
        boolean hasDigits = countDigits > 0;
        boolean hasSpecialChars = countSpecialChars > 0;

        boolean isStrongPassword = password.length() >=0 && countUpperCase >=1 && countLowerCase >=1 &&
                                   countDigits >= 1 && countSpecialChars >=1;

        System.out.println("isStrongPassword = " + isStrongPassword);




    }
}
