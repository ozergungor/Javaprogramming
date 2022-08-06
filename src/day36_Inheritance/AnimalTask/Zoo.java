package day36_Inheritance.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M',
                    2, "Small", "White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Arya", "Tekir", 'F',
                    3, "Medium", "Brown");
        System.out.println(dog);

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();

        System.out.println(cat);


        Tiger tiger = new Tiger();
        tiger.setInfo("John", "Bengal", 'M',
                      7, "Large", "Orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.hunt();
        tiger.roar();

        System.out.println(tiger);
    }
}
