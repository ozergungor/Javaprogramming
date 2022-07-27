package day24_CustomMethods_ReturnMethod;

public class DomainOfTheEmail {
    public static void main(String[] args) {
        domain("Cydeo.School@gmail.com");


    }


    public static void domain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }
}


