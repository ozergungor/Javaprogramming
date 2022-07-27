package day24_CustomMethods_ReturnMethod;

public class frequencyOfWord_Task1 {
    public static void main(String[] args) {

        String sentence = "Java java java python python";
        String word = "java";

        int frequency = frequencyOfWord(sentence, word);
        System.out.println(frequency);
    }
    public static int frequencyOfWord(String sentence, String word) {

        String[] array = sentence.split(" ");
        int freq = 0;

        for (String each : array) {
            if (each.equalsIgnoreCase(word)) {
                freq++;
            }
        }
        return freq;
    }
}

/*
Create a method named frequencyOfWord that passes two parameters:
string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */
