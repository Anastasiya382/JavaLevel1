package Lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот", "Багсик",  0,  200);
        animals[1] = new Cat("Кот", "Ора", 6,  550);
        animals[2] = new Dog("Пес", "Бублик", 55, 1000);
        animals[3] = new Dog("Пес", "Шарик", 60, 500);

        System.out.println("Бег: ");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(500);
        }

        System.out.println();
        System.out.println("Плавание: ");

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(50);
        }

    }

}
