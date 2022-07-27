package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int a = 5;
        ++a;
        System.out.println(a);

        --a;
        System.out.println(a);

        int b = 100 ;
        System.out.println(++b);

        int c = 100 ;
        System.out.println(c++);
        System.out.println(c);

        int x = 200;
        System.out.println(--x);

        System.out.println("----------------");

        int y = 200;
        System.out.println(y--);
        System.out.println(y);

        System.out.println("--------------------");

        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);
        System.out.println("------------------");

        int q = 30;
        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);

    }
}
