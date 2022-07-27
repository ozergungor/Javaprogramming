package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        Integer num = 100;

        list.remove(num);
        System.out.println(list);

        list.clear();

        System.out.println(list.size());

        System.out.println("-------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');
        int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);



    }
}
