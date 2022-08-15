package day43_Abstraction.EmployeeTask;

public class EmployeeObjects {

    public static void main(String[] args) {

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 120000);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 97500);
        Teacher teacher = new Teacher("Fatma", 23, 'F', 35, "Instructor", 148000);
        Driver driver = new Driver("Alberto", 46, 'M', 45, "Bus driver", 78000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        developer.work();
        developer.sleep();
        developer.unitTest();
        developer.eat();

        teacher.work();
        teacher.sleep();
        teacher.eat();

        driver.work();
        driver.sleep();
        driver.eat();
    }
}
