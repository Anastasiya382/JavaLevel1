package Lesson5;

public class HomeWorkApp5 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Иванов Иван", "Java Developer", "java1@mail.ru", "89279555", 70000, 45);
        employeeArray[1] = new Employee("Морозов Кирилл", "Teamlead", "teamdlead@mail.ru", "78787771", 59000, 44);
        employeeArray[2] = new Employee("Петров Петр", "QA-Engineer", "qa1@mail.ru", "89272255", 68000, 35);
        employeeArray[3] = new Employee("Дмитриев Дима", "Java Developer", "java2@mail.ru", "892797822", 48000, 35);
        employeeArray[4] = new Employee("Бойко Женя", "Data Scientist", "ds1@mail.ru", "89279111", 39000, 26);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}
