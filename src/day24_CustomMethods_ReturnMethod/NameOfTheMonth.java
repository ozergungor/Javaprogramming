package day24_CustomMethods_ReturnMethod;

public class NameOfTheMonth {
    public static void main(String[] args) {

        nameOfMonth(3);

    }

    public static void nameOfMonth(int number){

        String name ="";
        if(number>=1 && number <=12){

            name= (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "March"
                    :(number==4)? "April" :(number==5)? "May" :(number==6)? "June"
                    :(number==7)? "July" :(number==8)? "Aug" :(number==9)? "Sept"
                    :(number==10)? "Oct" :(number==11)? "Nov" : "Dec";
        }else{
            name = "Invalid";
        }
        System.out.println("name = " + name);
    }
}
