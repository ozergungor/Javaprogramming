package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW", "3.20i", 2015, "Black",
                           40000.0, false, 54379, true );
        Car car2 = new Car("Renault", "Clio", 2019, "White",
                50000.0, false, 43000, true );
        Car car3 = new Car("Toyota", "Corolla", 2011, "Gray",
                25000, true, 160000, false );
        Car car4 = new Car("Mercedes", "GLA", 2022, "Blue",
                150000, false, 43000, false );

        System.out.println("car1 = " + car1);
        System.out.println("car2 = " + car2);

        car1.start();
        car1.service();
        car2.start();
        car2.service();

        ArrayList<Car> carlist = new ArrayList<>();
        
        carlist.addAll(Arrays.asList(car1, car2, car3, car4));

        System.out.println("carlist = " + carlist);

        carlist.removeIf(p-> p.miles > 50000 );

        System.out.println("carlist = " + carlist);

        for (Car each : carlist) {

            if(each.isOriginal){

                System.out.println(each);
            }
        }
    }

}
