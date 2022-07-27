package day20_Arrays;

public class IteratingArray {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};

        for (int i = 0; i <= numbers.length-1 ; i++) {

            System.out.println(numbers[i]);
            
        }
        for (int i = numbers.length-1; i >= 0 ; i--) {
            System.out.println(numbers[i]);

        }

        String[] fruits = {"Orange", "Banana", "Apple", "Strawberry", "Lemon", "Grape"};

        for (int i = 0; i < fruits.length; i++) {

            System.out.println(fruits[i]);


        }

        for (int i = fruits.length - 1; i >= 0; i--) {

            System.out.println(fruits[i]);

        }


    }
}
