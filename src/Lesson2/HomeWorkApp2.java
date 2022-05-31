package Lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        System.out.println(printTask1(4, 7));
        printTask2(7);
        System.out.println(printTask3(-5));
        printTask4("");
    }
/*
    public static void printTask() {
        int a = 7, b = 5;{
            if (a + b < 10)
                System.out.println("false");
            if (a + b > 20)
                System.out.println("false");
            if (a + b > 10 && a + b < 20)
                System.out.println("true");
        }
    }
 */

    public static boolean printTask1( int a, int b) {
        if (a+b >10 && a+b <20){
            return true;
        }
        else {
            return false;
        }
    }
    public static void printTask2( int a ){
        if (a >= 0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
    }
    public static boolean printTask3( int a) {
        if (a < 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void printTask4(String word){
        for (int g = 0; g < 3; g++ ) {
            for (int j = 0; j < 9; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
