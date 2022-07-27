package day20_Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80};
        for(int  each : numbers){
            System.out.println(each);
        }

        String[] fruits = {"Orange", "Banana", "Apple", "Strawberry", "Lemon", "Grape"};
        for (String fruit : fruits) {

            System.out.println(fruit);

        }
    }
}
