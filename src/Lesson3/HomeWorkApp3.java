package Lesson3;

import java.sql.SQLOutput;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        firstTask();
        System.out.println();
        secondTask();
        System.out.println();
        thirdTask();
        System.out.println();
        fourthTask();
        System.out.println();
        fifthTask(5, 1);
        System.out.println();
        sixthTask();
        System.out.println();


    }
    public static void firstTask() {
        int [] arr = {0, 1, 0, 0, 1, 1, 1, 0, 1, 1};
        for ( int i = 0; i < arr.length; i++) {
            if (arr[i] <= 0) {
                System.out.print("1" + " ");
            }
            else {
                System.out.print("0" + " ");
            }
        }
        System.out.println();
    }

    public static void secondTask() {
        int [] arr = new int[101];
        for (int i = 0; i < arr.length; i++ ) {
            System.out.println(" arr[" + i + "] = " + i);
        }
    }
    public static void thirdTask() {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]) <6) {
                arr[i] *=2;
                System.out.print(arr[i] + " ");
            }
            else {
                System.out.print (arr[i] + " ");
            }
        }
        System.out.println();
    }
    public static void fourthTask() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void fifthTask(int len, int initialValue) {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        System.out.println();
    }
    public static void sixthTask() {
        int nums[] = { -99, 10, 100134, 18, -79, 15, 34, -9, 285, 382, -100500};
        int min, max;
        min = max = nums[0];
        for (int i = 0; i < 11; i ++) {
            if (nums[i] < min) min = nums [i];
            if (nums[i] > max) max = nums [i];
        }
        System.out.println("min и max :" + min + " " + max);
    }

}
