package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task();
        Task2();

    }

    private static void Task() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ваше Имя: ");
        String name = in.next();
        System.out.printf("Привет,%s!", name);
    }

    private static void Task2() {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count_temp = 0;
        int count_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count_temp++;
                if (count_temp > count_max) {
                    count_max = count_temp;
                }
            } else {
                count_temp = 0;
            }
        }
        System.out.println(count_max);
    }
}