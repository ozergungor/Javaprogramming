package day30_CustomClass;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John", 'M', 25, 2237, "Developer", 10000, true);
        employee2.setInfo("Anna", 'F', 43, 2245, "Tester", 9500, false);
        employee3.setInfo("Mike", 'M', 23, 2435, "Tester", 4500, true);
        employee4.setInfo("David", 'M', 53, 2201, "Manager", 15000, true);
        employee5.setInfo("Mary", 'F', 29, 2275, "Developer", 5600, false);

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for(Employee employee : employees){

            if(employee.isFullTime){

                countFullTime++;
            }else{

                countPartTime++;
            }
            if(employee.salary > max){
                max = employee.salary;
            }
            if(employee.salary < max){

                min = employee.salary;
            }
        }
        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
