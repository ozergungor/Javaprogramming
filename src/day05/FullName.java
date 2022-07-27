package day05;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class FullName {
    public static void main(String[] args) {
        
        String firstName = "Güngör";
        String lastName = "Özer";
        int age = 45;
        String jobTitle = "SDET" ;
        String companyName = "Apple Inc";
        double salary = 100000.58;

        String fullName = firstName + " " + lastName ;

        System.out.println("Full name of the person is " + fullName);
        System.out.println(fullName + " is " + age + " years old."   );
        System.out.println(fullName + " is " + jobTitle + ", and works at "
                + companyName + ", and " + fullName
                + "'s salary is $" + salary);

    }
}
