package homework1;

// 1. Задать одномерный массив и найти в нем минимальный и максимальный элементы
// 2. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
// не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.
// 3. Дан массив nums = [3,2,2,3] и число val = 3.
//Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
//Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // createArr(); // Задание 1
        // whatYear(); // Задание 2
        numsVal(); // Задание 3

    }

    // Задание 1
    public static void createArr() {
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте количество чисел в массиве: ");
        int len = Integer.parseInt(in.next());
        System.out.print("Задайте максимально возможное число в массиве: ");
        int max = Integer.parseInt(in.next());
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * max);
        }
        System.out.print("Задан массив: ");
        System.out.printf(Arrays.toString(array));
        System.out.println();
        int maximum = 0;
        int minimum = max;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maximum) {
                maximum = array[i];
            } else if (array[i] < minimum) {
                minimum = array[i];
            }
        }
        System.out.print("Максимальное значение в массиве: ");
        System.out.printf(String.valueOf(maximum));
        System.out.println();
        System.out.print("Минимальное значение в массиве: ");
        System.out.printf(String.valueOf(minimum));
    }

    // Задание 2
    public static void whatYear(){
        Scanner in = new Scanner(System.in);
        System.out.print("Задайте год: ");
        int year = Integer.parseInt(in.next());
        boolean answer;
        if (year % 4 != 0) {
            answer = false;
        } else if (year % 100 == 0) {
            if (year % 400 == 0) {
                answer = true;
            }
            else answer = false;
        }
        else answer = true;
        System.out.printf("Ответ: %s!", answer);
    }

    // Задание 3.
    public static void numsVal() {
        Integer[] nums = {3, 2, 2, 3};
        int val = 3;
        int j = 0;
        List<Integer> rez = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                j++;
            }
            else rez.add(nums[i]);
        }
        for (int i = 0; i < j; i++) {
            rez.add(val);
        }
        System.out.printf("Изначальный массив: %s", Arrays.toString(nums));
        System.out.println();
        System.out.printf("Итоговый массив: %s", rez);
    }

}


