package Lesson6;

public class Animal {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;


    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + " УСПЕШНО пробежал " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " сошел с дистанции ");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + " УСПЕШНО проплыл " + distance + "м.");
        } else {
            System.out.println(this.type + " по кличке " + this.name + " сошел с дистанции ");
        }
    }
}
