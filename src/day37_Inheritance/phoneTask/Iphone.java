package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void facetime(long phoneNumber){
        System.out.println(brand + " " + model + " is having  a facetime");
    }

    public void facetime(String email){
        System.out.println(brand + " " + model + " is having  a facetime email");
    }
}
