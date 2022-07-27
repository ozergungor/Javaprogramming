package day20_Arrays;

public class ClassmatesInitials_Task1 {
    public static void main(String[] args) {

        String[] classmates = {"Ahmet Örsel", "Mete Çabuk", "Ayşe Tarz", "Meral Tek",
                               "Metin Tandoğdu", "Sema Aytaç", "Bora Güven", "Sefa Nar",
                               "Arzu Boz", "Mehmet Murtaza"};

        for (int i = 0; i < classmates.length; i++) {

            String initial = classmates[i].charAt(0) + "." + classmates[i].charAt(classmates[i].indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}
/*
Create an array named classmates, and store 10 of your classmates' full names.
Print the initials of each classmates in separate lines.
 */
