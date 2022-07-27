package day20_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] numbers = {5,1,3,4,2,0};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        char[] arr1 = {'a', 'b', 'c'};
        char[] arr2 = {'a', 'b', 'c'};

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] scores  = {45, 55, 65, 75, 85};
        int[] scores2 = Arrays.copyOf(scores, 3);
        System.out.println(Arrays.toString(scores2));

        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};

        char[] someElements = Arrays.copyOfRange(elements, 1,5);
        System.out.println(Arrays.toString(someElements));


        

    }
}
