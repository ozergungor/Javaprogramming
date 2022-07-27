package day24_CustomMethods_ReturnMethod;

public class NameOfDay {
    public static void main(String[] args) {

        nameOfDay(2);

    }
    public static void nameOfDay(int number){

        String name="";

        if(number>=1 && number<=7){

            name = (number==1)? "Monday" :(number==2)? "Tuesday" :(number==3)? "Wednesday"
                    :(number==4)? "Thursday" :(number==5)? "Friday" :(number==6)? "Saturday"
                    : "Sunday";

            System.out.println("name = " + name);

        }else{
            System.out.println("Invalid");
        } 
    }
}
