package Lesson5;

public class Employee {
    private final String name;
    private final String post;
    private final String email;
    private final String phoneNumber;
    private final int salary;
    private final int age;

    public int getAge() {
        return age;
    }

    public Employee(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void print() {
        System.out.println("Имя: " + name + " | " + " Должность: " + post + " | " + " e-mail: " + email + " | " +
                " Тел.: " + phoneNumber + " | " + " ЗП: " + salary + " | " + " Возраст: " + age);

    }
}

