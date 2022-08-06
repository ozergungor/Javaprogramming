package day30_CustomClass;

public class Car {

    public String brand;
    public String model;
    public int year;
    public String color;
    public double price;
    public boolean isExtraLPG;
    public int miles;
    public boolean isOriginal;

    public Car(String brand, String model, int year, String color, double price, boolean isExtraLPG, int miles, boolean isOriginal) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isExtraLPG = isExtraLPG;
        this.miles = miles;
        this.isOriginal = isOriginal;
    }

    public void start(){
        System.out.println(brand + " is starting");
    }

    public void service(){System.out.println(brand + " is in service");
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                ", isExtraLPG=" + isExtraLPG +
                ", miles=" + miles +
                ", isOriginal=" + isOriginal +
                '}';
    }
}
