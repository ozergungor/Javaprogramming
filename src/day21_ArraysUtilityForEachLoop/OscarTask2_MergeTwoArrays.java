package day21_ArraysUtilityForEachLoop;

import java.util.Arrays;

public class OscarTask2_MergeTwoArrays {

    public static void main(String[] args) {


        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};


        int[] result = new int[arr1.length+ arr2.length];
        int j = 0;

        for (int each : arr1) {
            result[j++] = each;
        }

        for (int each : arr2) {
            result[j++] = each;
        }

        System.out.println(Arrays.toString(result));
    }
}
