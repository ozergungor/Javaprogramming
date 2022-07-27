package day15_ForLoop;

public class StringMethod5 {
    public static void main(String[] args) {

        String str = " ";
        boolean r = str.isEmpty();

        System.out.println("r = " + r);

        boolean r1 = str.isBlank();
        System.out.println("r1 = " + r1);

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence = "My favorite programming language is Java";
        boolean result = sentence.contains("C#");
        System.out.println("result = " + result);
        boolean hasJava = sentence.contains("Java");
        System.out.println("hasJava = " + hasJava);
        boolean hasJava2 = sentence.toLowerCase().contains("java");
        System.out.println("hasJava2 = " + hasJava2);

        String input1 = "I love Java";
        String input2 = "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains("Java"));
        System.out.println(input1.toLowerCase().contains("java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));

        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo");
        System.out.println("x = " + x);

        boolean y = a.endsWith("Spoon");
        System.out.println("y = " + y);






    }
}
