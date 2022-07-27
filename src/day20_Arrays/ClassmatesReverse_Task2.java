package day20_Arrays;

public class ClassmatesReverse_Task2 {
    public static void main(String[] args) {

        String[] classmates = {"Ahmet Örsel", "Mete Çabuk", "Ayşe Tarz", "Meral Tek",
                "Metin Tandoğdu", "Sema Aytaç", "Bora Güven", "Sefa Nar",
                "Arzu Boz", "Mehmet Murtaza"};

        for (int i = 0; i < classmates.length; i++) {

            String name = classmates[i];
            String reverseName = "";

            for (int j = name.length()-1; j >=0 ; j--) {

                reverseName += name.charAt(j);
            }
            System.out.println(reverseName);
        }
    }
}
/*
Create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
       ex:
           arr = {java, python, c#}

        	output:
        		    avaJ
        			nohtyp
        			#c
 */
