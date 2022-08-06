package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        Student student2 = new Student("Aygun", 'F');
        Student student3 = new Student("Nigara", 'F', 4564);
        Student student4 = new Student("Ali", 'M', 7645, 25);
        Student student5 = new Student("Jamy", 'F', 6573, 49, 'A');


        System.out.println(student1 == student2);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);

        Student[] students = {student1, student2, student3, student4, student5};
        System.out.println(Arrays.toString(students));


    }
}
