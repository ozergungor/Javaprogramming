package day43_Abstraction.Car;

public class CarShop {

    public static void main(String[] args) {

        Honda honda = new Honda("Accord", "Black", 2019, 120000);
        Audi audi = new Audi("07", "White", 2021, 150000);
        Tesla tesla = new Tesla("Model-3", "Blue", 2022, 170000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        honda.setColor("Pink");
        audi.setColor("Orange");
        tesla.setColor("Black");
        honda.setPrice(55000);
        audi.setPrice(62000);
        tesla.setPrice(91000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);
    }
}
