package day09_IfElseAndMultiBranchStatements;

public class MinAmongThreeNumbers {
    public static void main(String[] args) {

        int n1 = 5,
                n2 = 3,
                n3 = 9;

        boolean Isn1Min = n1 < n2 && n1 < n3;
        boolean Isn2Min = n2 < n1 && n2 < n3;

        if(Isn1Min){
            System.out.println(n1 + " is minimum number");
        }
        else if(Isn2Min){
            System.out.println(n2 + " is minimum number" );
        }
        else{
            System.out.println(n3 + " is minimum number");
        }
    }
}
