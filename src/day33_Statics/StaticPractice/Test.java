package day33_Statics.StaticPractice;

import day33_Statics.Student;

import static day33_Statics.StaticPractice.Students.*;

public class Test {
    public static void main(String[] args) {

        Students student1 =  new Students("İsmail", 41, 11);
        Students student2 = new Students("Mustafa", 36, 12);
        Students student3 = new Students("Enes", 22, 13);
        Students student4 = new Students("İhsan", 22, 14);
        Students student5 = new Students("Güngör", 50, 15);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);
        System.out.println("student5 = " + student5);

        System.out.println("Name of Instructor: " + nameOfInstructor);
        System.out.println("Name of School: " + schoolName);
        System.out.println("Gender of Students: " + gender);

        open();
        student1.drink();

    }
}
