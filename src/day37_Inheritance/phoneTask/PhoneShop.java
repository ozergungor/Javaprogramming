package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "6.7 inches", 900, "White");
        Samsung samsung = new Samsung("Galaxy 250", "Large", 500, "Red");
        Nokia nokia = new Nokia("maraket", "Small", 450, "Yellow");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(12987367);
        iphone.facetime(23457896);
        iphone.facetime("Cydeo@gmail.com");
        System.out.println("---------------------------------------");

        samsung.call(12987453);
        samsung.text(8794373);
        samsung.freeze();

        System.out.println("----------------------------------------");

        nokia.call(74645383);
        nokia.text(75692003);
        nokia.selfDefense();

        System.out.println("-----------------------------------------");

        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);









    }
}
