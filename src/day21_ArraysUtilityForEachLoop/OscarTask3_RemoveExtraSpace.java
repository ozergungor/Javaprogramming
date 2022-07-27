package day21_ArraysUtilityForEachLoop;

import java.util.Scanner;

public class OscarTask3_RemoveExtraSpace {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        String input,output="";
        char c;
        int i,len;
        System.out.println("Enter your sentence please: ");
        input=scan.nextLine().trim();
        len=input.length();
        for(i=0;i<len;i++){
            c=input.charAt(i);
            output+=c;
            if(c==' '){
                while(input.charAt(i)==' '){
                    i++;
                }
                i--;
            }
        }
        System.out.println(output);
    }
}


