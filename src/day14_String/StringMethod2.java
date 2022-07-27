package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java" , "Python");
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo" , "gmail");
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Python Python C# C# C+ C++ Python Python";
        sentence = sentence.replace("Python " , "");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog Dog";
        String s2= s.replace("Dog" , "Cat");
        System.out.println("s2 = " + s2);

        String s3 = "C# is fun, C# is cool";
        String s4 = s3.replace(" C#", " Java");
        System.out.println("s4 = " + s4);

        String s5 = "Java";
        String s6 = s5.replace("a" , "o");
        System.out.println("s6 = " + s6);

        String result = "Java Java Java";
        result = result.replaceFirst("Java" , "Python");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#" , "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "e");
        System.out.println("result3 = " + result3);






    }
}
