package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        String[] colors = {"Yellow", "Red", "Black", "White", "Blue", "Green"};
        System.out.println(Arrays.toString(colors));
        System.out.println(colors.length);
    }
}
