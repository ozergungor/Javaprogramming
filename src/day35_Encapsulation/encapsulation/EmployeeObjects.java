package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 15000);

        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2 = new Employee("Aygun", 'F', 31, 12000);

        employee2.setSalary(employee2.getSalary()+ 15000);
        employee2.setName("Elvira");
        System.out.println(employee2);




    }
}
