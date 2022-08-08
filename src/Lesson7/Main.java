package Lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsic", 15),
                new Cat("Molly", 10),
                new Cat("Marusya", 20)
        };
        Plate plate = new Plate(50, 30);
        System.out.println("Was in " + plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println("Left in " + plate);
        plate.add(40);
        System.out.println("Added to " + plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}
