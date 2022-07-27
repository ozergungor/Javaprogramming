package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python";
        int frequency = 0;

        while (str.contains("Java")) {
            str = str.replaceFirst("Java", "");
            frequency++;
        }
        System.out.println(frequency);

        System.out.println();
        System.out.println("===============================================");

        String sentence = "cat cat cat cat dog cat dog cat cat dog cat";
        int frequency1 = 0;

        while (sentence.contains("cat")) {
            sentence = sentence.replaceFirst("cat", "");
            frequency1++;
        }
        System.out.println(frequency1);
    }
    }

