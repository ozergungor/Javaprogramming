package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        numbers.add(2,25);
        numbers.add(5,55);

        System.out.println(numbers);

        System.out.println(numbers.size());

        int lastIndex = numbers.size()-1;
        System.out.println(lastIndex);

        int num =numbers.get(3);
        System.out.println("num = " + num);

        for (int i = 0; i < numbers.size(); i++) {

            System.out.println(numbers.get(i));
                    }

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2,"JavaScript");
        list.set(3,"Java");

        System.out.println(list);


        ArrayList<String> employees = new ArrayList<>();

        employees.add("Ahmet");
        employees.add("Mehmet");
        employees.add("Fatma");
        employees.add("Emine");
        employees.add("Sezgin");
        employees.add("Hulya");
        employees.add("Sena");

        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);

        employees.remove(employees.size()-1);
        System.out.println(employees);

        employees.remove("Hulya");
        System.out.println(employees);







    }
}
